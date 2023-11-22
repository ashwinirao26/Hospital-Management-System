package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// Service and Repository annotations to specify the role of this class in the Spring context
@Service
@Repository
public class PatientDaoImpl implements PatientDao {

	// Autowired PatientRepository for data access
	@Autowired
	private PatientRepository repository;

	// Method to save a new patient in the database
	@Override
	public void savePatient(Patient patient) {
		repository.save(patient);
	}

	// Method to retrieve a list of all patients from the database
	@Override
	public List<Patient> displayAllPatients() {
		return repository.findAll();
	}

	// Method to find a patient by their unique identifier (patientId)
	@Override
	public Patient findPatientById(Integer patientId) {
		return repository.findById(patientId).get();
	}

	// Method to generate a new unique identifier for a patient
	@Override
	public int generateNewPatientId() {
		int newId = 1;
		int val = repository.getPatientCount();
		if (val > 0)
			newId = val + 1;
		return newId;
	}

	// Method to retrieve a list of all patientIds in the database
	@Override
	public List<Integer> getAllPatientIds() {
		return repository.getAllPatientIds();
	}

	// Method to retrieve a list of patientIds for admitted patients in the database
	@Override
	public List<Integer> getAdmittedPatientIds() {
		return repository.getAddmitedPatientIds();
	}

}
