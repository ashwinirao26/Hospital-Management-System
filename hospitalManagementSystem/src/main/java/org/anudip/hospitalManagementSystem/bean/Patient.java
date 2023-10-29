package org.anudip.hospitalManagementSystem.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

//Bean Class
@Entity
public class Patient {
	@Id
	private Integer patientNumber;
	private String patientName;
	private String patientAddress;
	private Integer contactNo;
	private String gender;
	private String caseType;
	private String wardId;
	private String addmissionDate;
	private String releasedDate;
	private String doctorId;
	private Integer doctorVisits;
	private Double doctorFees;
	private Double medicalExp;
	
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Patient(Integer patientNumber, String patientName, String patientAddress, Integer contactNo, String gender,
			String caseType, String wardId, String addmissionDate, String doctorId) {
		super();
		this.patientNumber = patientNumber;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.contactNo = contactNo;
		this.gender = gender;
		this.caseType = caseType;
		this.wardId = wardId;
		this.addmissionDate = addmissionDate;
		this.doctorId = doctorId;
	}


	public Patient(Integer patientNumber, String patientName, String patientAddress, Integer contactNo, String gender,
			String caseType, String wardId, String addmissionDate, String releasedDate, String doctorId,
			Integer doctorVisits, Double doctorFees, Double medicalExp) {
		super();
		this.patientNumber = patientNumber;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.contactNo = contactNo;
		this.gender = gender;
		this.caseType = caseType;
		this.wardId = wardId;
		this.addmissionDate = addmissionDate;
		this.releasedDate = releasedDate;
		this.doctorId = doctorId;
		this.doctorVisits = doctorVisits;
		this.doctorFees = doctorFees;
		this.medicalExp = medicalExp;
	}


	public Patient(Integer patientNumber) {
		super();
		this.patientNumber = patientNumber;
	}


	public Integer getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(Integer patientNumber) {
		this.patientNumber = patientNumber;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public Integer getContactNo() {
		return contactNo;
	}
	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCaseType() {
		return caseType;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public String getWardId() {
		return wardId;
	}
	public void setWardId(String wardId) {
		this.wardId = wardId;
	}
	public String getAddmissionDate() {
		return addmissionDate;
	}
	public void setAddmissionDate(String addmissionDate) {
		this.addmissionDate = addmissionDate;
	}
	public String getReleasedDate() {
		return releasedDate;
	}
	public void setReleasedDate(String releasedDate) {
		this.releasedDate = releasedDate;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public Integer getDoctorVisits() {
		return doctorVisits;
	}
	public void setDoctorVisits(Integer doctorVisits) {
		this.doctorVisits = doctorVisits;
	}
	public Double getDoctorFees() {
		return doctorFees;
	}
	public void setDoctorFees(Double doctorFees) {
		this.doctorFees = doctorFees;
	}
	public Double getMedicalExp() {
		return medicalExp;
	}
	public void setMedicalExp(Double medicalExp) {
		this.medicalExp = medicalExp;
	}
	
}
