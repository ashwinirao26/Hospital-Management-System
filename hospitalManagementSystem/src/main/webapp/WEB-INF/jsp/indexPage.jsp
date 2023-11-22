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

/* Styling for the button container */
.button-container {
	text-align: center;
	background-color: #f5f5f5; /* Light gray background color */
	padding: 20px;
	border-radius: 10px; /* Rounded corners for the container */
	margin: 20px auto; /* Center the container on the page */
	width: 80%; /* Adjust the width of the container */
}
</style>
</head>
<body>
	<div align="center">
		<h1
			style="font-size: 36px; color: #800080; text-align: center; text-transform: uppercase; font-weight: bold; text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);">Welcome
			To Proper Care Hospital Booking System</h1>

	</div>

	<div class="button-container">
		<h2>
			<button type="submit">
				<a href="/ward" style="text-decoration: none; color: white;">Ward
					Addition</a>
			</button>
			&nbsp;&nbsp;
			<button type="submit">
				<a href="/doctor" style="text-decoration: none; color: white;">Doctor's
					Addition</a>
			</button>
			&nbsp;&nbsp;
			<button type="submit">
				<a href="/patient" style="text-decoration: none; color: white;">Patient
					Admission</a>
			</button>
			<br /> <br />
			<button type="submit">
				<a href="/wards" style="text-decoration: none; color: white;">Ward
					List</a>
			</button>
			&nbsp;&nbsp;
			<button type="submit">
				<a href="/doctors" style="text-decoration: none; color: white;">Doctor
					List</a>
			</button>
			&nbsp;&nbsp;
			<button type="submit">
				<a href="/patients" style="text-decoration: none; color: white;">Patient
					List</a>
			</button>
			</button>
			&nbsp;&nbsp;
			<button type="submit">
				<a href="/patient-find" style="text-decoration: none; color: white;">Patient
					Release</a>
			</button>
		</h2>
	</div>
</body>
</html>
