package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class PatientDaoImpl implements PatientDao {

	@Autowired
	private PatientRepository repository;

	@Override
	public void savePatient(Patient patient) {
		repository.save(patient);
	}

	@Override
	public List<Patient> displayAllPatients() {
		return repository.findAll();
	}

	@Override
	public Patient findPatientById(Integer patientId) {
		return repository.findById(patientId).get();
	}

	@Override
	public int generateNewPatientId() {
		int newId = 1;
		int val = repository.getPatientCount();
		if (val>0)
			newId = val+1;
		return newId;
	}


	@Override
	public List<Integer> getAllPatientIds() {
		return repository.getAllPatientIds();
	}

}
