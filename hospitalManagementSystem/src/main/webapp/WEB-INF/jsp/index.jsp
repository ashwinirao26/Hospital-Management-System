<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hospital Management System</title>
<style>
/* CSS for button styling */
button {
	background-color: #DA70D6; /* Green background color */
	color: white; /* White text color */
	padding: 10px 20px; /* Padding for the button */
	border: none; /* No border */
	border-radius: 5px; /* Rounded corners */
	text-align: center; /* Center the text */
	text-decoration: none; /* Remove underlines from links */
	display: inline-block; /* Display as an inline element */
	font-size: 16px; /* Font size */
	margin: 4px 2px; /* Margin around the button */
	cursor: pointer; /* Add a pointer cursor on hover */
}
/* Additional CSS for button hover effect */
button:hover {
	background-color: #BA55D3; /* Darker green background color on hover */
}
</style>
</head>
<body>
	<div align="center">
		<h1>Welcome To Proper Care Hospital Booking System</h1>
		<h2>
			<button type="submit">
				<a href="/ward" style="text-decoration: none; color: white;">Ward Addition</a>
			</button>
			&nbsp;&nbsp;
			<button type="submit">
				<a href="/doctor" style="text-decoration: none; color: white;">Doctor's Addition</a>
			</button>
			&nbsp;&nbsp;
			<button type="submit">
				<a href="/patient" style="text-decoration: none; color: white;">Patient Addmission</a>
			</button>
		</h2>
	</div>
</body>
</html>

