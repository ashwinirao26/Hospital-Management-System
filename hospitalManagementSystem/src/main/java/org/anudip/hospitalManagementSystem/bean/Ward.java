package org.anudip.hospitalManagementSystem.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

// Bean Class representing a Ward entity
@Entity
public class Ward {
	@Id
	private String wardId;
	private String wardName;
	private Integer beds;
	private Integer available;
	private Double farePerDay;

	// Default constructor
	public Ward() {
		super();
	}

	// Constructor to initialize all fields
	public Ward(String wardId, String wardName, Integer beds, Integer available, Double farePerDay) {
		super();
		this.wardId = wardId;
		this.wardName = wardName;
		this.beds = beds;
		this.available = available;
		this.farePerDay = farePerDay;
	}

	// Constructor with only wardId for simplicity
	public Ward(String wardId) {
		super();
		this.wardId = wardId;
	}

	// Getter method for wardId
	public String getWardId() {
		return wardId;
	}

	// Setter method for wardId
	public void setWardId(String wardId) {
		this.wardId = wardId;
	}

	// Getter method for wardName
	public String getWardName() {
		return wardName;
	}

	// Setter method for wardName
	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	// Getter method for beds
	public Integer getBeds() {
		return beds;
	}

	// Setter method for beds
	public void setBeds(Integer beds) {
		this.beds = beds;
	}

	// Getter method for available
	public Integer getAvailable() {
		return available;
	}

	// Setter method for available
	public void setAvailable(Integer available) {
		this.available = available;
	}

	// Getter method for farePerDay
	public Double getFarePerDay() {
		return farePerDay;
	}

	// Setter method for farePerDay
	public void setFarePerDay(Double farePerDay) {
		this.farePerDay = farePerDay;
	}
}
