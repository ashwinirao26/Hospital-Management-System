<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Release Page</title>
</head>
<body>
	<div align="center">
		<h1>
			<u>Patient Release Form</u>
		</h1>
		<form:form action="/patient-release" method="post"
			modelAttribute="patientRecord">
			<h3>
				Patient Number:
				<form:input type="text" path="patientNumber" readOnly="true" />
				<br /> <br /> Patient Name:
				<form:input type="text" path="patientName" readOnly="true" />
				<br /> <br /> Patient Address:
				<form:input type="text" path="patientAddress" readOnly="true" />
				<br /> <br /> Contact Number:
				<form:input type="text" path="contactNo" readOnly="true" />
				<br /> <br /> Gender:
				<form:input type="text" path="gender" readOnly="true" />
				<br /> <br /> Case Type:
				<form:input type="text" path="caseType" readOnly="true" />
				<br /> <br /> Doctor Id:
				<form:input type="text" path="doctorId" readOnly="true" />
				<br /> <br /> Ward Id:
				<form:input type="text" path="wardId" readOnly="true" />
				<br /> <br /> Addmission Date:
				<form:input type="text" path="addmissionDate" readOnly="true" />
				<br /> <br />Released Date:
				<form:input type="text" path="releasedDate" />
				<br /> <br />Doctor Visits:
				<form:input type="text" path="doctorVisits" />
				<form:input type="hidden" value="0.0" path="doctorFees" />
				<form:input type="hidden" value="0.0" path="wardExp" />
				<br /> <br />Medical Expense:
				<form:input type="text" path="medicalExp" />
				<br /> <br />
				<button type="submit">Submit</button>
			</h3>
		</form:form>
	</div>
</body>
</html>