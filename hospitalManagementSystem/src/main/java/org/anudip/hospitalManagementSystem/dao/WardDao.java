package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Ward;

// DAO Interface for Ward entity
public interface WardDao {

	// Method to save a new ward in the database
	public void saveWard(Ward ward);

	// Method to retrieve a list of all wards from the database
	public List<Ward> displayAllWards();

	// Method to find a ward by its unique identifier (wardId)
	public Ward findWardById(String wardId);

	// Method to generate a new unique identifier for a ward
	public String generateNewWardId();

	// Method to retrieve a list of all wardIds in the database
	public List<String> displayWardIds();
}
