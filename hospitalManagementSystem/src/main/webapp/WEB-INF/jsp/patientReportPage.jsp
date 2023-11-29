<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Report Page</title>
</head>
<body>
	<div align="center">
		<h1>
			<u>All Patients</u>
		</h1>
		<h3>
			<table border="2">
				<tr>
					<th>Patient Number</th>
					<th>Patient Name</th>
					<th>Patient Address</th>
					<th>Contact No</th>
					<th>Gender</th>
					<th>Case Type</th>
					<th>Ward Id</th>
					<th>Addmission Date</th>
					<th>Released Date</th>
					<th>Doctor Id</th>
					<th>Doctor Visits</th>
					<th>Doctor Fees</th>
					<th>Medical Expense</th>
					<th>Ward Expense</th>
				</tr>
				<c:forEach items="${patientReport}" var="patient">
					<tr>
						<td>${patient.patientNumber}</td>
						<td>${patient.patientName}</td>
						<td>${patient.patientAddress}</td>
						<td>${patient.contactNo}</td>
						<td>${patient.gender}</td>
						<td>${patient.caseType}</td>
						<td>${patient.wardId}</td>
						<td>${patient.addmissionDate}</td>
						<td>${patient.releasedDate}</td>
						<td>${patient.doctorId}</td>
						<td>${patient.doctorVisits}</td>
						<td>${patient.doctorFees}</td>
						<td>${patient.medicalExp}</td>
						<td>${patient.wardExp}</td>
					</tr>
				</c:forEach>
			</table>
			<br /> <a href="index">Return</a>
	</div>
</body>
</html>