package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import java.util.NoSuchElementException;

import org.anudip.hospitalManagementSystem.bean.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// Service and Repository annotations to specify the role of this class in the Spring context
@Service
@Repository
public class DoctorDaoImpl implements DoctorDao {

	// Autowired DoctorRepository for data access
	@Autowired
	private DoctorRepository repository;

	// Method to save a new doctor in the database
	@Override
	public void saveDoctor(Doctor doctor) {
		repository.save(doctor);
	}

	// Method to retrieve a list of all doctors from the database
	@Override
	public List<Doctor> displayAllDoctors() {
		return repository.findAll();
	}

	// Method to find a doctor by their unique identifier (doctorId)
	@Override
	public Doctor findDoctorById(String doctorId) {
		return repository.findById(doctorId).get();
	}

	// Method to generate a new unique identifier for a doctor
	@Override
	public String generateNewDoctorId() {
		// Logic to generate a new doctorId based on the existing count in the database
		String newId = "";
		int val = repository.getDoctorCount();
		if (val == 0)
			newId = "D1001";
		else if (val > 0) {
			val = 1000 + (val + 1);
			newId = "D" + val;
		}
		return newId;
	}

	// Method to retrieve a list of all doctorIds in the database
	@Override
	public List<String> getAllDoctorIds() {
		return repository.getAllDoctorIds();
	}
}
