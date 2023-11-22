package org.anudip.hospitalManagementSystem.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

// Bean Class representing a Patient entity
@Entity
public class Patient {
	@Id
	private Integer patientNumber;
	private String patientName;
	private String patientAddress;
	private Long contactNo;
	private String gender;
	private String caseType;
	private String wardId;
	private String addmissionDate;
	private String releasedDate;
	private String doctorId;
	private Integer doctorVisits;
	private Double doctorFees;
	private Double medicalExp;
	private Double wardExp;

	// Default constructor
	public Patient() {
		super();
	}

	// Constructor for patient details without release information
	public Patient(Integer patientNumber, String patientName, String patientAddress, Long contactNo, String gender,
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

	// Constructor for patient details with release information
	public Patient(Integer patientNumber, String patientName, String patientAddress, Long contactNo, String gender,
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

	// Constructor with only patientNumber for simplicity
	public Patient(Integer patientNumber) {
		super();
		this.patientNumber = patientNumber;
	}

	// Getter method for wardExp
	public Double getWardExp() {
		return wardExp;
	}

	// Setter method for wardExp
	public void setWardExp(Double wardExp) {
		this.wardExp = wardExp;
	}

	// Getter method for patientNumber
	public Integer getPatientNumber() {
		return patientNumber;
	}

	// Setter method for patientNumber
	public void setPatientNumber(Integer patientNumber) {
		this.patientNumber = patientNumber;
	}

	// Getter method for patientName
	public String getPatientName() {
		return patientName;
	}

	// Setter method for patientName
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	// Getter method for patientAddress
	public String getPatientAddress() {
		return patientAddress;
	}

	// Setter method for patientAddress
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	// Getter method for contactNo
	public Long getContactNo() {
		return contactNo;
	}

	// Setter method for contactNo
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	// Getter method for gender
	public String getGender() {
		return gender;
	}

	// Setter method for gender
	public void setGender(String gender) {
		this.gender = gender;
	}

	// Getter method for caseType
	public String getCaseType() {
		return caseType;
	}

	// Setter method for caseType
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	// Getter method for wardId
	public String getWardId() {
		return wardId;
	}

	// Setter method for wardId
	public void setWardId(String wardId) {
		this.wardId = wardId;
	}

	// Getter method for addmissionDate
	public String getAddmissionDate() {
		return addmissionDate;
	}

	// Setter method for addmissionDate
	public void setAddmissionDate(String addmissionDate) {
		this.addmissionDate = addmissionDate;
	}

	// Getter method for releasedDate
	public String getReleasedDate() {
		return releasedDate;
	}

	// Setter method for releasedDate
	public void setReleasedDate(String releasedDate) {
		this.releasedDate = releasedDate;
	}

	// Getter method for doctorId
	public String getDoctorId() {
		return doctorId;
	}

	// Setter method for doctorId
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	// Getter method for doctorVisits
	public Integer getDoctorVisits() {
		return doctorVisits;
	}

	// Setter method for doctorVisits
	public void setDoctorVisits(Integer doctorVisits) {
		this.doctorVisits = doctorVisits;
	}

	// Getter method for doctorFees
	public Double getDoctorFees() {
		return doctorFees;
	}

	// Setter method for doctorFees
	public void setDoctorFees(Double doctorFees) {
		this.doctorFees = doctorFees;
	}

	// Getter method for medicalExp
	public Double getMedicalExp() {
		return medicalExp;
	}

	// Setter method for medicalExp
	public void setMedicalExp(Double medicalExp) {
		this.medicalExp = medicalExp;
	}
}
