package org.anudip.hospitalManagementSystem.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

//Bean Class
@Entity
public class Ward {
	@Id
	private String wardId;
	private String wardName;
	private Integer beds;
	private Integer available;
	private Double farePerDay;

	public Ward() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ward(String wardId, String wardName, Integer beds, Integer available, Double farePerDay) {
		super();
		this.wardId = wardId;
		this.wardName = wardName;
		this.beds = beds;
		this.available = available;
		this.farePerDay = farePerDay;
	}

	public Ward(String wardId) {
		super();
		this.wardId = wardId;
	}

	public String getWardId() {
		return wardId;
	}

	public void setWardId(String wardId) {
		this.wardId = wardId;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public Integer getBeds() {
		return beds;
	}

	public void setBeds(Integer beds) {
		this.beds = beds;
	}

	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

	public Double getFarePerDay() {
		return farePerDay;
	}

	public void setFarePerDay(Double farePerDay) {
		this.farePerDay = farePerDay;
	}
}
