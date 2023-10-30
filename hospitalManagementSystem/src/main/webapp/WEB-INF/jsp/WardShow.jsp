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
			<u>${wardRecord.wardName} Ward List</u>
		</h1>
		<h3>
			Ward Id:${wardRecord.wardId} <br />Ward Name:${wardRecord.wardName}
			<br />Beds :${wardRecord.beds} <br />
			Available:${wardRecord.available} <br />Fare Per Day:
			${wardRecord.farePerDay} <br /> <br /> <a href="/index">Return</a>
		</h3>
</body>
</html>