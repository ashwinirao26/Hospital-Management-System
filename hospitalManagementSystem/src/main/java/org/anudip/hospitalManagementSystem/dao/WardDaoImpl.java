package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Ward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// Service and Repository annotations to specify the role of this class in the Spring context
@Service
@Repository
public class WardDaoImpl implements WardDao {

	// Autowired WardRepository for data access
	@Autowired
	private WardRepository repository;

	// Method to save a new ward in the database
	@Override
	public void saveWard(Ward ward) {
		repository.save(ward);
	}

	// Method to retrieve a list of all wards from the database
	@Override
	public List<Ward> displayAllWards() {
		return repository.findAll();
	}

	// Method to find a ward by its unique identifier (wardId)
	@Override
	public Ward findWardById(String wardId) {
		return repository.findById(wardId).get();
	}

	// Method to generate a new unique identifier for a ward
	@Override
	public String generateNewWardId() {
		// Logic to generate a new wardId based on the existing count in the database
		String newId = "";
		int val = repository.getWardCount();
		if (val == 0)
			newId = "W101";
		else if (val > 0) {
			val = 100 + (val + 1);
			newId = "W" + val;
		}
		return newId;
	}

	// Method to retrieve a list of all wardIds in the database
	@Override
	public List<String> displayWardIds() {
		return repository.getAllWardIds();
	}

}
