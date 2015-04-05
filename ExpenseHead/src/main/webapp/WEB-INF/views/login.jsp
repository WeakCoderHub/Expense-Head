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
<script src="resources/js/register.js"></script>
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


						<div style="height: 35px;margin-bottom: 8px;">
							<div class="lable">Group Name </div>
							<div class="lable right"><form:input id="groupid" path="groupId" cssClass="form-control" /></div>
						</div>
						<div style="height: 35px;margin-bottom: 8px;">
							<div class="lable">User Name </div>
							<div class="lable right" id="usernameempty"><input  id="ClearCache"   class="form-control" /></div>
							<div class="right hide" id="usernamelist">  <select id="userNames" class="select-style">
								<option value="">Select User</option>
							</select></div>
							
						</div>
                        <div style="height: 35px;margin-bottom: 8px;">
                           <div class="lable">Password </div>
                           <div class="lable right">
                           <form:password path="password"
										cssClass="form-control" /></div>
                        </div>
                        
                        <div style="margin: 30px 30px;"><input type="submit" value="Login" class="formbtn" onclick="populateUserName()" /><input
									type="reset" value="Cancel" class="formbtn" style="margin-left: 65px"/></div>
                        
                        <div class="hide"><form:input path="userName" id="setUserName" /></div>
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