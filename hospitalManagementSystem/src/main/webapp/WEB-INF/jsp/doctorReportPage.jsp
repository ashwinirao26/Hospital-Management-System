<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>
			<u>All Doctors</u>
		</h1>
		<h3>
			<table border="2">
				<tr>
					<th>Doctor Id</th>
					<th>Doctor Name</th>
					<th>Specialization</th>
					<th>Fee</th>
					<th>Patient Count</th>
				</tr>
				<c:forEach items="${doctorReport}" var="doctor">
					<tr>
						<td>${doctor.doctorId}</td>
						<td>${doctor.doctorName}</td>
						<td>${doctor.specialization}</td>
						<td>${doctor.fee}</td>
						<td>${doctor.patientCount}</td>
					</tr>
				</c:forEach>
			</table>
			<br /> <a href="index">Return</a>
	</div>
</body>
</html>