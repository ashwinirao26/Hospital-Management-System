//package org.anudip.hospitalManagementSystem.controller;
//
//import java.util.List;
//import org.anudip.hospitalManagementSystem.bean.Doctor;
//import org.anudip.hospitalManagementSystem.bean.Patient;
//import org.anudip.hospitalManagementSystem.bean.Ward;
//import org.anudip.hospitalManagementSystem.dao.DoctorDao;
//import org.anudip.hospitalManagementSystem.dao.PatientDao;
//import org.anudip.hospitalManagementSystem.dao.WardDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@CrossOrigin(origins = "http://localhost:9898/")
//@RestController
//public class HospitalControllerAngular {
//	@Autowired
//	private WardDao wardDao;
//
//	@Autowired
//	private DoctorDao doctorDao;
//
//	@Autowired
//	private PatientDao patientDao;
//
//	@GetMapping("/ward")
//	public List<Ward> displayAllWards() {
//		return wardDao.displayAllWards();
//	}
//	
//	@PostMapping("/ward")
//	public void saveWard(@RequestBody Ward ward) {
//		wardDao.saveWard(ward);
//	}
//	
//	@GetMapping("/doctor")
//	public List<Doctor> displayAllDoctors() {
//		return doctorDao.displayAllDoctors();
//	}
//
//	@PostMapping("/doctor")
//	public void saveDoctor(@RequestBody Doctor doctor) {
//		doctorDao.saveDoctor(doctor);
//	}
//	
//	@GetMapping("/patient")
//	public List<Patient> displayAllPatients() {
//		return patientDao.displayAllPatients();
//	}
//	
//	@PostMapping("/patient")
//	public void savePatient(@RequestBody Patient patient) {
//		patientDao.savePatient(patient);
//	}
//}
