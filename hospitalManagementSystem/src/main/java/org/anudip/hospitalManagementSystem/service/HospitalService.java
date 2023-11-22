package org.anudip.hospitalManagementSystem.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import org.anudip.hospitalManagementSystem.bean.Doctor;
import org.anudip.hospitalManagementSystem.bean.Ward;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {

	// Method to calculate doctor fees based on the number of visits
	public double doctorFeeCalculation(Doctor doctor, int noOfVisits) {
		// Get the doctor's fee and calculate the total fees
		double doctorFees = doctor.getFee();
		return doctorFees * noOfVisits;
	}

	// Method to calculate ward expenses based on admission and release dates
	public double wardExpenseCalculation(Ward ward, String admitDate, String releaseDate) {
		// Parse the admission and release dates
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate admissionDate = LocalDate.parse(admitDate, dateFormat);
		LocalDate releaseDate1 = LocalDate.parse(releaseDate, dateFormat);

		// Calculate the period between admission and release dates
		Period period = Period.between(admissionDate, releaseDate1);
		int dateDiff = period.getDays();

		// Get the bed rate per day and calculate the total ward fare
		double bedRatePerDay = ward.getFarePerDay();
		double wardFare = dateDiff * bedRatePerDay;
		return wardFare;
	}
}
