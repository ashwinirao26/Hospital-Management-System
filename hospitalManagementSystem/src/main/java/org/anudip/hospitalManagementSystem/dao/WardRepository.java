package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// Repository interface for Ward entity, extending JpaRepository for CRUD operations
public interface WardRepository extends JpaRepository<Ward, String> {

	// Query method to retrieve the count of wards in the database
	@Query("select count(wardId) from Ward")
	public int getWardCount();

	// Query method to retrieve a list of all wardIds in the database
	@Query("select wardId from Ward")
	public List<String> getAllWardIds();
}
