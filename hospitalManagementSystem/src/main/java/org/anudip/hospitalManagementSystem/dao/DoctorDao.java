package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Doctor;

public interface DoctorDao {
	public void saveDoctor(Doctor doctor); // store new doctor

	public List<Doctor> displayAllDoctors();

	public Doctor findDoctorById(String doctorId);

	public String generateNewDoctorId();

	public List<String> getAllDoctorIds();
}
