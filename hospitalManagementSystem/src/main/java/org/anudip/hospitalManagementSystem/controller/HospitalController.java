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

	@GetMapping("/patient")
	public ModelAndView showPatientEntryPage() {
		ModelAndView mv = new ModelAndView("PatientEntry");
		Integer newId = patientDao.generateNewPatientId();
		Patient patient = new Patient(newId);
		mv.addObject("patientRecord", patient);
		return mv;
	}
}
