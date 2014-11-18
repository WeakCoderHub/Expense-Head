<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/style.css" rel="stylesheet" type="text/css" />
<link rel="ICON" href="resources/images/titlelogo.png" type="image/ico/">

<link rel="stylesheet" type="text/css"
	href="../../resources/css/sliding/demo.css" />
<link rel="stylesheet" type="text/css"
	href="resources/css/sliding/jPushMenu.css" />

<link href="resources/css/carousel/js-image-slider.css" rel="stylesheet"
	type="text/css" />
<script src="resources/js/carousel/js-image-slider.js"
	type="text/javascript"></script>

<script src="resources/js/sliding/jquery-1.9.1.min.js"></script>
<script src="resources/js/sliding/jPushMenu.js"></script>

<script src="resources/js/ajax.js"></script>
<!--call jPushMenu, required-->
<script>
	jQuery(document).ready(function($) {
		$('.toggle-menu').jPushMenu();
	});
</script>
</head>
<title>Expense Head</title>


<body>


	<div id="header">
		<div id="logo">
			<img id="logo" src="resources/images/logo.PNG" />
		</div>
		<label id="Register" class="toggle-menu menu-right push-body CC"><b>Register</b></label>
		<label id="AboutUs" class="CC"><b>About Us</b></label>

	</div>


	<nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-right">
		<!-- 		registration code here -->
		<jsp:include page="register_group.jsp"></jsp:include>
	</nav>

	<div style="height: 48em;">
		<div id="container">
			<div id="leftContainer">


				<div id="sliderFrame">
					<div id="slider">
						<img src="resources/images/carousel/image-slider-1.jpg" /> <img
							src="resources/images/carousel/image-slider-2.jpg" /> <img
							src="resources/images/carousel/image-slider-3.jpg" /> <img
							src="resources/images/carousel/image-slider-4.jpg" />
					</div>
				</div>
			</div>

			<div id="rightContainer">
				<button id="loginbutton" class="CC">Login</button>

				<div id="justify">
					<br /> <br />

					<form:form method="post" modelAttribute="loginForm" action="login">
						<table>
							<tr>
								<td align="center" width="200">Group Name :</td>
								<td align="left"><form:input id="groupid" path="groupId" /></td>
								<td align="left" width="400"><form:errors path="groupId"
										cssClass="error" /></td>
							</tr>
							<tr>
								<td align="center" width="200px">User Name :</td>
								<td align="left"><form:select id="userNames"
										path="userName">
										<form:option value="">Select User</form:option>
									</form:select></td>
								<td><form:errors path="userName" cssClass="error" /></td>
							</tr>
							<tr>
								<td align="center" width="200">Password :</td>
								<td align="left"><form:password path="password" /></td>
								<td align="left" width="400">
								<form:errors path="password" cssClass="error" /></td>
							</tr>
							<tr>
								<td></td>
								<td align="left"><input type="submit" value="Save" />&nbsp;&nbsp;&nbsp;<input
									type="reset" value="Cancel" /></td>
							</tr>
						</table>
					</form:form>
				</div>

			</div>
		</div>

	</div>

	<div id="footer">
		@Copyright<br>
		<h3>Contact us : weakcoder@gmail.com</h3>
	</div>

</body>

</html>