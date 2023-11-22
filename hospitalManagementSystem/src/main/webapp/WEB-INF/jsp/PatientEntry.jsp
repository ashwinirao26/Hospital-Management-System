<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Patient Entry</title>
</head>
<body>
	<div align="center">
		<h1>
			<u>New Patient Entry Page</u>
		</h1>
		<form:form action="/patient" method="post"
			modelAttribute="patientRecord">
			<h3>
				Patient Number:
				<form:input type="text" path="patientNumber" readOnly="true" />
				<br /> <br /> Patient Name:
				<form:input type="text" path="patientName" />
				<br /> <br /> Patient Address:
				<form:input type="text" path="patientAddress" />
				<br /> <br /> Contact Number:
				<form:input type="text" path="contactNo" />
				<br /> <br /> Gender:
				<form:input type="text" path="gender" />
				<br /> <br /> Case Type:
				<form:input type="text" path="caseType" />
				<br /> <br /> Doctor Id:
				<form:input type="text" path="doctorId" list="doctorIds" />
				<datalist id="doctorIds">
					<option value="D1001">
					<option value="D1002">
					<option value="D1003">
					<option value="D1004">
					<option value="D1005">
					<option value="D1006">
					<option value="D1007">
				</datalist>
				<br /> <br /> Ward Id:
				<form:input type="text" path="wardId" list="wardIds" />
				<datalist id="wardIds">
					<option value="W101">
					<option value="W102">
					<option value="W103">
					<option value="W104">
					<option value="W105">
					<option value="W106">
					<option value="W107">
				</datalist>
				<br /> <br /> Addmission Date:
				<form:input type="text" path="addmissionDate" />

				<!--<form:input type="calendar" path="addmissionDate" />-->
				<br /> <br />
				<form:input type="hidden" path="releasedDate" />
				<form:input type="hidden" path="doctorVisits" />
				<form:input type="hidden" path="doctorFees" />
				<form:input type="hidden" path="medicalExp" />
				<form:input type="hidden" path="wardExp" />
				<button type="submit">Submit</button>
			</h3>
		</form:form>
	</div>
</body>
</html>









