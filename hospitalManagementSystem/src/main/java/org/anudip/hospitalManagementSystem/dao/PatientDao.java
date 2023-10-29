package org.anudip.hospitalManagementSystem.dao;

import java.util.List;

import org.anudip.hospitalManagementSystem.bean.Patient;

public interface PatientDao {
	public void savePatient(Patient patient); // store new patient

	public List<Patient> displayAllPatients();

	public Patient findPatientById(Integer patientId);

	public int generateNewPatientId();

	public List<Integer> getAllPatientIds();
}
