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
			<u>${patientRecord.patientName} Patient List</u>
		</h1>
		<h3>
			Patient Number:${patientRecord.patientNumber} <br />Patient
			Name:${patientRecord.patientName} <br />Patient Address
			:${patientRecord.patientAddress} <br /> Contact
			Number:${patientRecord.contactNo} <br />Gender:
			${patientRecord.gender} <br />Case Type: ${patientRecord.caseType} <br />
			Ward Id: ${patientRecord.wardId} <br /> Addmission Date:
			${patientRecord.addmissionDate} <br /> Released Date:
			${patientRecord.releasedDate} <br /> Doctor Id:
			${patientRecord.doctorId} <br /> Doctor Visits:
			${patientRecord.doctorVisits} <br /> Doctor Fees:
			${patientRecord.doctorFees} <br /> Medical Exp:
			${patientRecord.medicalExp} <br /> <br /> <a href="/index">Return</a>
		</h3>
</body>
</html>