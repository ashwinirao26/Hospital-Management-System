package org.anudip.hospitalManagementSystem.controller;

import java.util.List;

import org.anudip.hospitalManagementSystem.bean.Doctor;
import org.anudip.hospitalManagementSystem.bean.Patient;
import org.anudip.hospitalManagementSystem.bean.Ward;
import org.anudip.hospitalManagementSystem.dao.DoctorDao;
import org.anudip.hospitalManagementSystem.dao.PatientDao;
import org.anudip.hospitalManagementSystem.dao.WardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

	@GetMapping("/index")
	public ModelAndView showIndexPage() {
		return new ModelAndView("index");
	}

	@GetMapping("/ward")
	public ModelAndView showWardEntryPage() {
		ModelAndView mv = new ModelAndView("WardEntry");
		String newId = wardDao.generateNewWardId();
		Ward ward = new Ward(newId);
		mv.addObject("wardRecord", ward);
		return mv;
	}

	@PostMapping("/ward")
	public ModelAndView saveWard(@ModelAttribute("wardRecord") Ward ward) {
		wardDao.saveWard(ward);
		return new ModelAndView("redirect:/index");
	}

	@GetMapping("/wards")
	public ModelAndView showAllWardPage() {
		ModelAndView mv = new ModelAndView("wardReportPage");
		List<Ward> wardList = wardDao.displayAllWards();
		mv.addObject("wardReport", wardList);
		return mv;
	}

	@GetMapping("/doctor")
	public ModelAndView showDoctorEntryPage() {
		ModelAndView mv = new ModelAndView("DoctorEntry");
		String newId = doctorDao.generateNewDoctorId();
		Doctor doctor = new Doctor(newId);
		mv.addObject("doctorRecord", doctor);
		return mv;
	}

	@PostMapping("/doctor")
	public ModelAndView saveDoctor(@ModelAttribute("doctorRecord") Doctor doctor) {
		doctorDao.saveDoctor(doctor);
		return new ModelAndView("redirect:/index");
	}

	@GetMapping("/doctors")
	public ModelAndView showAllDoctorPage() {
		ModelAndView mv = new ModelAndView("doctorReportPage");
		List<Doctor> doctorList = doctorDao.displayAllDoctors();
		mv.addObject("doctorReport", doctorList);
		return mv;
	}

	@GetMapping("/patient")
	public ModelAndView showPatientEntryPage() {
		ModelAndView mv = new ModelAndView("PatientEntry");
		Integer newId = patientDao.generateNewPatientId();
		Patient patient = new Patient(newId);
		mv.addObject("patientRecord", patient);
		return mv;
	}

	@PostMapping("/patient")
	public ModelAndView savePatient(@ModelAttribute("patientRecord") Patient patient) {
		patientDao.savePatient(patient);
		return new ModelAndView("redirect:/index");
	}

	@GetMapping("/patients")
	public ModelAndView showAllPatientPage() {
		ModelAndView mv = new ModelAndView("patientReportPage");
		List<Patient> patientList = patientDao.displayAllPatients();
		mv.addObject("patientReport", patientList);
		return mv;
	}
}
