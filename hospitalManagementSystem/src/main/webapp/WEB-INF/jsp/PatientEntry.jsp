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
				<br /> <br /> Ward Id:
				<form:input type="text" path="wardId" />
				<br /> <br /> Addmission Date:
				<form:input type="text" path="addmissionDate" />
				<br /> <br /> Doctor Id:
				<form:input type="text" path="doctorId" />
				<form:input type="hidden" path="releasedDate" />
				<form:input type="hidden" path="doctorVisits" />
				<form:input type="hidden" path="doctorFees" />
				<form:input type="hidden" path="medicalExp" />
				<button type="submit">Submit</button>
			</h3>
		</form:form>
	</div>
</body>
</html>