<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Page</title>
</head>
<body>
	<div align="center">
		<h1>
			<u>Patient Bill Page</u>
		</h1>
		<table border="1">
			<tr>
				<th>Patient Number</th>
				<td>${patient.patientNumber}</td>
			</tr>

			<tr>
				<th>Patient Name</th>
				<td>${patient.patientName}</td>
			</tr>

			<tr>
				<th>Patient Address</th>
				<td>${patient.patientAddress}</td>
			</tr>

			<tr>
				<th>Contact No</th>
				<td>${patient.contactNo}</td>
			</tr>

			<tr>
				<th>Gender</th>
				<td>${patient.gender}</td>
			</tr>

			<tr>
				<th>Case Type</th>
				<td>${patient.caseType}</td>
			</tr>

			<tr>
				<th>Ward Id</th>
				<td>${patient.wardId}</td>
			</tr>

			<tr>
				<th>Addmission Date</th>
				<td>${patient.addmissionDate}</td>
			</tr>

			<tr>
				<th>Released Date</th>
				<td>${patient.releasedDate}</td>
			</tr>

			<tr>
				<th>Doctor Id</th>
				<td>${patient.doctorId}</td>
			</tr>

			<tr>
				<th>Doctor Visits</th>
				<td>${patient.doctorVisits}</td>
			</tr>

			<tr>
				<th>Doctor Fees</th>
				<td>${patient.doctorFees}</td>
			</tr>

			<tr>
				<th>Medical Expense</th>
				<td>${patient.medicalExp}</td>
			</tr>

			<tr>
				<th>Ward Expense</th>
				<td>${patient.wardExp}</td>
			</tr>
			<tr>
				<th>Total Amount Payable</th>
				<td><b>${totalAmount}</b></td>
			</tr>
		</table>
		<br /> <br /> <a href="/index">Return</a>
	</div>
</body>
</html>