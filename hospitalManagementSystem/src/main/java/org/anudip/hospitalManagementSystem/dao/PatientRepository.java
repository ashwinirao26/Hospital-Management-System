package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// Repository interface for Patient entity, extending JpaRepository for CRUD operations
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	// Query method to retrieve the count of patients in the database
	@Query("select count(patientNumber) from Patient")
	public int getPatientCount();

	// Query method to retrieve a list of all patientIds in the database
	@Query("select patientNumber from Patient")
	public List<Integer> getAllPatientIds();

	// Query method to retrieve a list of patientIds for admitted patients in the
	// database
	@Query("select patientNumber from Patient where medicalExp is null")
	public List<Integer> getAddmitedPatientIds();
}
