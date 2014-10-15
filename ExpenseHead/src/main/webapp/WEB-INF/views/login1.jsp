<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/style.css" rel="stylesheet" type="text/css" /> 
<link rel="ICON" href="resources/images/titlelogo.png" type="image/ico/">
<title>Expense Head</title>
</head>
<body>
		<div id="header">   
				<label class="headcolor"></label>
				<button id="Register" class="CC">Register</button>
				<button id="AboutUs" class="CC">About Us</button>
		</div>	
		
   		<div id="container"> 
			<div id="logo" class="right"> <img id="logo" src="resources/images/FLOGO1.PNG"/> </div>
			<div id="leftContainer">
				<div id="sliderFrame">
					<div id="slider">
						<img src="resources/images/image-slider-1.jpg" alt="Welcome to Weakcoder.com" />
					</div>	
				</div>	
			</div>
			<div id="rightContainer">
				<button id="loginbutton" class="CC">Login</button>
				
				<div id="justify">
					<br /><br />
					<form action="" method="post" >
						<label class="CC">Group ID</label><br /><input type="text" id="gid" class="input" required/><br /><br/>
						<label class="CC">User ID </label><br /><select name="mytextarea" class="input">
							<option  value="zero">  </option>
							<option name="one" value="one"> one </option>
							<option name="two" value="two"> two </option>
							<option name="three" value="three"> three </option>
							</select><br /><br/>
						<label class="CC">Password</label><br /><input type="password" id="password"  class="input" required/><br/><br/>
						<input id="sbutton" type="submit" value="submit" />
					</form>
				    <a href="#"> forget password</a>
				</div>
				
			</div>
			
			
		</div> 
		<div id="footer">@Copyright</div>   
		
</body>

</html>