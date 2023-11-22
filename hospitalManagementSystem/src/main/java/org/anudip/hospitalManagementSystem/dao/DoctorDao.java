package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Doctor;

// DAO Interface for Doctor entity
public interface DoctorDao {

	// Method to save a new doctor in the database
	public void saveDoctor(Doctor doctor);

	// Method to retrieve a list of all doctors from the database
	public List<Doctor> displayAllDoctors();

	// Method to find a doctor by their unique identifier (doctorId)
	public Doctor findDoctorById(String doctorId);

	// Method to generate a new unique identifier for a doctor
	public String generateNewDoctorId();

	// Method to retrieve a list of all doctorIds in the database
	public List<String> getAllDoctorIds();
}
