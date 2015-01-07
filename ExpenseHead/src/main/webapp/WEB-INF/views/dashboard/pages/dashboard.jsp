<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="dash" tagdir="/WEB-INF/tags/dashboard"%>

<!DOCTYPE html >
<html>
<head>
<link href="resources/css/dashboard/css_dashboard.css" rel="stylesheet"
	type="text/css" />

</head>

<body style="margin: 0px !important; height: 100%; width: 100%;">
	<dash:header />
	<dash:addExpense />

	<div>
		<div style="float: left;">arun garg ....</div>

		<div style="float: left; width: 80% !important;" id='popupBackground'></div>

		<div style="float: right;">
			<dash:leftSection balance="${currentAmount}" />
		</div>
	</div>

</body>
<script src="resources/js/sliding/jquery-1.9.1.min.js"></script>
<script src="resources/js/ajax.js"></script>
<script type="text/javascript"
	src="resources/js/dashboard/js_dashboard.js"></script>
</html>