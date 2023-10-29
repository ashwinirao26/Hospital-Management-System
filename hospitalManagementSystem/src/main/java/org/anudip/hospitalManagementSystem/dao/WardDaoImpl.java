package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Ward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class WardDaoImpl implements WardDao {
	@Autowired
	private WardRepository repository;

	@Override
	public void saveWard(Ward ward) {
		repository.save(ward);
	}

	@Override
	public List<Ward> displayAllWards() {
		return repository.findAll();
	}

	@Override
	public Ward findWardById(String wardId) {
		return repository.findById(wardId).get();
	}

	@Override
	public String generateNewWardId() {
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

	@Override
	public List<String> displayWardIds() {
		return repository.getAllWardIds();
	}

}
