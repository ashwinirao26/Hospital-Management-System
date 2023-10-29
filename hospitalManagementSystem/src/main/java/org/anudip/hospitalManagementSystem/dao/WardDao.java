package org.anudip.hospitalManagementSystem.dao;

import java.util.List;
import org.anudip.hospitalManagementSystem.bean.Ward;

public interface WardDao {
	public void saveWard(Ward ward); // store new ward

	public List<Ward> displayAllWards();

	public Ward findWardById(String wardId);

	public String generateNewWardId();

	public List<String> displayWardIds();
}
