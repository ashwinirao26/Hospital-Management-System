package org.anudip.hospitalManagementSystem.dao;

import java.util.List;

import org.anudip.hospitalManagementSystem.bean.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {
	@Query("select count(doctorId) from Doctor")
	public int getDoctorCount();

	@Query("select doctorId from Doctor")
	public List<String> getAllDoctorIds();
}
