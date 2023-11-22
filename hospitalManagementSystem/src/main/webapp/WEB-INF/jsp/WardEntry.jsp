<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ward Entry</title>
</head>
<body>
	<div align="center">
		<h1>
			<u>New Ward Entry Page</u>
		</h1>
		<form:form action="/ward" method="post" modelAttribute="wardRecord">
			<h3>
				Ward Id:
				<form:input type="text" path="wardId" readOnly="true" />
				<br /> <br /> Ward Name:
				<form:input type="text" path="wardName" />
				<br /> <br /> Beds:
				<form:input type="text" path="beds" />
				<!--  <br /> <br /> Available: -->
				<form:input type="hidden" path="available" />
				<br /> <br /> Fare Per Day:
				<form:input type="text" path="farePerDay" />
				<br /> <br />
				<button type="submit">Submit</button>
			</h3>
		</form:form>
	</div>
</body>
</html>