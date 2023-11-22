package org.anudip.hospitalManagementSystem.controller;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Doctor;
import org.anudip.hospitalManagementSystem.bean.Patient;
import org.anudip.hospitalManagementSystem.bean.Ward;
import org.anudip.hospitalManagementSystem.dao.DoctorDao;
import org.anudip.hospitalManagementSystem.dao.PatientDao;
import org.anudip.hospitalManagementSystem.dao.WardDao;
import org.anudip.hospitalManagementSystem.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HospitalController {
	@Autowired
	private WardDao wardDao;

	@Autowired
	private DoctorDao doctorDao;

	@Autowired
	private PatientDao patientDao;

	@Autowired
	private HospitalService service;

	// Method to display the index page
	@GetMapping("/index")
	public ModelAndView showIndexPage() {
		return new ModelAndView("indexPage");
	}

	// Method to display the Ward entry page
	@GetMapping("/ward")
	public ModelAndView showWardEntryPage() {
		ModelAndView mv = new ModelAndView("WardEntry");
		// Generate a new Ward ID and create a new Ward object
		String newId = wardDao.generateNewWardId();
		Ward ward = new Ward(newId);
		mv.addObject("wardRecord", ward);
		return mv;
	}

	// Method to save Ward information
	@PostMapping("/ward")
	public ModelAndView saveWard(@ModelAttribute("wardRecord") Ward ward) {
		// Set the available beds in the ward and save the ward information
		ward.setAvailable(ward.getBeds());
		wardDao.saveWard(ward);
		return new ModelAndView("redirect:/index");
	}

	// Method to display all Wards
	@GetMapping("/wards")
	public ModelAndView showAllWardPage() {
		ModelAndView mv = new ModelAndView("wardReportPage");
		List<Ward> wardList = wardDao.displayAllWards();
		mv.addObject("wardReport", wardList);
		return mv;
	}

	// Method to display the Doctor entry page
	@GetMapping("/doctor")
	public ModelAndView showDoctorEntryPage() {
		ModelAndView mv = new ModelAndView("DoctorEntry");
		// Generate a new Doctor ID and create a new Doctor object
		String newId = doctorDao.generateNewDoctorId();
		Doctor doctor = new Doctor(newId);
		mv.addObject("doctorRecord", doctor);
		return mv;
	}

	// Method to save Doctor information
	@PostMapping("/doctor")
	public ModelAndView saveDoctor(@ModelAttribute("doctorRecord") Doctor doctor) {
		// Save the doctor information
		doctorDao.saveDoctor(doctor);
		return new ModelAndView("redirect:/index");
	}

	// Method to display all Doctors
	@GetMapping("/doctors")
	public ModelAndView showAllDoctorPage() {
		ModelAndView mv = new ModelAndView("doctorReportPage");
		List<Doctor> doctorList = doctorDao.displayAllDoctors();
		mv.addObject("doctorReport", doctorList);
		return mv;
	}

	// Method to display the Patient entry page
	@GetMapping("/patient")
	public ModelAndView showPatientEntryPage() {
		ModelAndView mv = new ModelAndView("PatientEntry");
		// Generate a new Patient ID and create a new Patient object
		Integer newId = patientDao.generateNewPatientId();
		Patient patient = new Patient(newId);
		mv.addObject("patientRecord", patient);
		return mv;
	}

	// Method to save Patient information
	@PostMapping("/patient")
	public ModelAndView savePatient(@ModelAttribute("patientRecord") Patient patient) {
		// Update bed availability in the ward and save patient information
		Ward ward = wardDao.findWardById(patient.getWardId());
		int bedAvailable = ward.getAvailable();
		bedAvailable--;
		ward.setAvailable(bedAvailable);

		// Increment patient count for the assigned doctor
		Doctor doctor = doctorDao.findDoctorById(patient.getDoctorId());
		int patientCount = doctor.getPatientCount();
		patientCount++;
		doctor.setPatientCount(patientCount);
		doctorDao.saveDoctor(doctor);
		wardDao.saveWard(ward);
		patientDao.savePatient(patient);
		return new ModelAndView("redirect:/index");
	}

	// Method to display all Patients
	@GetMapping("/patients")
	public ModelAndView showAllPatientPage() {
		ModelAndView mv = new ModelAndView("patientReportPage");
		List<Patient> patientList = patientDao.displayAllPatients();
		mv.addObject("patientReport", patientList);
		return mv;
	}

	// Method to display the Patient find page
	@GetMapping("/patient-find")
	public ModelAndView patientFindPage() {
		ModelAndView mv = new ModelAndView("patientFind");
		List<Integer> patientNumberList = patientDao.getAllPatientIds();
		mv.addObject("patientNumberList", patientNumberList);
		return mv;
	}

	// Method to open the Patient show/update page
	@PostMapping("/patient-find")
	public ModelAndView openPatientShowUpdatePage(@RequestParam("patientNumber") Integer patientNumber) {
		ModelAndView mv = new ModelAndView("PatientReleasePage");
		Patient patient = patientDao.findPatientById(patientNumber);
		// System.out.println(patient.getReleasedDate());
		if (!patient.getReleasedDate().equals("")) {
			return new ModelAndView("ErrorPage");
		} else {
			mv.addObject("patientRecord", patient);
			return mv;
		}
	}

	// Method to display the error page
	@GetMapping("/ErrorPage")
	public ModelAndView showErrorPage() {
		return new ModelAndView("ErrorPage");
	}

	// Method to release a patient
	@PostMapping("/patient-release")
	public ModelAndView patientRelease(@ModelAttribute("patientRecord") Patient patient) {
		// Perform calculations and update information before releasing the patient
		Ward ward = wardDao.findWardById(patient.getWardId());
		Doctor doctor = doctorDao.findDoctorById(patient.getDoctorId());
		double totalFees = service.doctorFeeCalculation(doctor, patient.getDoctorVisits());
		patient.setDoctorFees(totalFees);
		double wardExpense = service.wardExpenseCalculation(ward, patient.getAddmissionDate(),
				patient.getReleasedDate());
		patient.setWardExp(wardExpense);
		int bedAvailable = ward.getAvailable();
		bedAvailable++;
		ward.setAvailable(bedAvailable);
		int patientCount = doctor.getPatientCount();
		patientCount--;
		doctor.setPatientCount(patientCount);
		wardDao.saveWard(ward);
		doctorDao.saveDoctor(doctor);
		patientDao.savePatient(patient);
		// Display patient bill information
		ModelAndView mv = new ModelAndView("patientBill");
		double totalAmount = patient.getDoctorFees() + patient.getMedicalExp() + patient.getWardExp();
		mv.addObject("patient", patient);
		mv.addObject("totalAmount", totalAmount);
		return mv;
	}

}
