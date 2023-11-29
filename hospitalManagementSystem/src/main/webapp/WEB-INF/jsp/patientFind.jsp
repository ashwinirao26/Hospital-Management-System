<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Find</title>
</head>
<body>
	<div align="center">
		<h3>
			<form action="patient-find" method="post">
				Select Admitted Patient Id:<input type="text" name="patientNumber"
					list="numList" />
				<datalist id="numList">
					<c:forEach items="${patientNumberList}" var="num">
						<option value="${num}">${num}</option>
					</c:forEach>
				</datalist>
				<br /> <br />
				<button type="submit" value="submit" name="submit">Submit</button>
			</form>
		</h3>
	</div>
</body>
</html>