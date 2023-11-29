package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// Repository interface for Doctor entity, extending JpaRepository for CRUD operations
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {

	// Query method to retrieve the count of doctors in the database
	@Query("select count(doctorId) from Doctor")
	public int getDoctorCount();

	// Query method to retrieve a list of all doctorIds in the database
	@Query("select doctorId from Doctor")
	public List<String> getAllDoctorIds();
}
