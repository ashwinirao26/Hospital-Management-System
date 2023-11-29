<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Doctor Entry</title>
</head>
<body>
	<div align="center">
		<h1>
			<u>New Doctor Entry Page</u>
		</h1>
		<form:form action="/doctor" method="post"
			modelAttribute="doctorRecord">
			<h3>
				Doctor Id:
				<form:input type="text" path="doctorId" readOnly="true" />
				<br /> <br /> Doctor Name:
				<form:input type="text" path="doctorName" />
				<br /> <br /> Specialization:
				<form:input type="text" path="specialization" />
				<br /> <br /> Fee:
				<form:input type="text" path="fee" />
				<br /> <br />Patient Count:
				<form:input type="text" path="patientCount" value="0" readOnly="true"/> 
				<br /> <br />
				<button type="submit">Submit</button>
			</h3>
		</form:form>
	</div>
</body>
</html>