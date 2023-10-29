package org.anudip.hospitalManagementSystem.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

//Bean Class
@Entity
public class Doctor {
	@Id
	private String doctorId;
	private String doctorName;
	private String specialization;
	private Double fee;
	private Integer patientCount;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String doctorId, String doctorName, String specialization, Double fee, Integer patientCount) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.fee = fee;
		this.patientCount = patientCount;
	}

	public Doctor(String doctorId) {
		super();
		this.doctorId = doctorId;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Integer getPatientCount() {
		return patientCount;
	}

	public void setPatientCount(Integer patientCount) {
		this.patientCount = patientCount;
	}
}
