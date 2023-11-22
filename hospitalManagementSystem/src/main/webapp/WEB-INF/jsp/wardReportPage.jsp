<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ward Report Page</title>
</head>
<body>
	<div align="center">
		<h1>
			<u>All Wards</u>
		</h1>
		<h3>
			<table border="2">
				<tr>
					<th>Ward Id</th>
					<th>Ward Name</th>
					<th>Beds</th>
					<th>Available</th>
					<th>Fare Per Day</th>
				</tr>
				<c:forEach items="${wardReport}" var="ward">
					<tr>
						<td>${ward.wardId}</td>
						<td>${ward.wardName}</td>
						<td>${ward.beds}</td>
						<td>${ward.available}</td>
						<td>${ward.farePerDay}</td>
					</tr>
				</c:forEach>
			</table>
			<br /> <a href="index">Return</a>
	</div>
</body>
</html>