package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	@Query("select count(patientNumber) from Patient")
	public int getPatientCount();

	@Query("select patientNumber from Patient")
	public List<Integer> getAllPatientIds();
}
