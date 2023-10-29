package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class DoctorDaoImpl implements DoctorDao {
	@Autowired
	private DoctorRepository repository;

	@Override
	public void saveDoctor(Doctor doctor) {
		repository.save(doctor);
	}

	@Override
	public List<Doctor> displayAllDoctors() {
		return repository.findAll();
	}

	@Override
	public Doctor findDoctorById(String doctorId) {
		return repository.findById(doctorId).get();
	}

	@Override
	public String generateNewDoctorId() {
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


	@Override
	public List<String> getAllDoctorIds() {
		return repository.getAllDoctorIds();
	}

}
