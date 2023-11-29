package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Patient;

// DAO Interface for Patient entity
public interface PatientDao {

	// Method to save a new patient in the database
	public void savePatient(Patient patient);

	// Method to retrieve a list of all patients from the database
	public List<Patient> displayAllPatients();

	// Method to find a patient by their unique identifier (patientId)
	public Patient findPatientById(Integer patientId);

	// Method to generate a new unique identifier for a patient
	public int generateNewPatientId();

	// Method to retrieve a list of all patientIds in the database
	public List<Integer> getAllPatientIds();

	// Method to retrieve a list of patientIds for admitted patients in the database
	public List<Integer> getAdmittedPatientIds();
}
