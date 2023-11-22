<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Show</title>
</head>
<body>
	<div align="center">
		<h1>
			<u>${doctorRecord.doctorName} Doctor List</u>
		</h1>
		<h3>
			Doctor Id:${doctorRecord.doctorId} <br />Doctor
			Name:${doctorRecord.doctorName} <br />
			Specialization:${doctorRecord.specialization} <br />
			Fee:${doctorRecord.fee} <br />Patient Count:
			${doctorRecord.patientCount} <br /> <br /> <a href="/index">Return</a>
		</h3>
</body>
</html>