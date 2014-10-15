<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type"
			content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="resources/css/login.css">
		<script src="resources/js/bootstrap.js"></script>
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

		<title>Login Page</title>
	</head>
		<body class="pattern pattern5">
			<div class="navbar navbar-inverse navbar-static">
				<div class="container">
						 <b class="navbar-brand" style="color: white;">SplitEasy</b>
				<div class="collapse navbar-collapse navHeaderCollapse">
					<ul class="nav navbar-nav navbar-right">
						<li><a style="font-size:large;">Register 
						<span class="glyphicon glyphicon-registration-mark"></span> </a>
						</li>
						<li>
							<a style="font-size:large;" href="#">About 
							<span class="glyphicon glyphicon-info-sign"></span></a>
						</li>
					</ul>
				</div>
				<button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
		</div>



		<form role="form">
			<table align="center" width="40%" style="margin-top: 13em;">
			<tr>
			<td>
				<div class="form-group">
					<label class="white-XL-Label" for="groupId">Group ID</label>
					<input type="text" class="form-control input-lg" id="groupId" placeholder="Enter Group ID">
				</div>
			</td>
			</tr>
			
			<tr>
			<td>
				<div class="form-group">
				<label class="white-XL-Label" for="userId">User ID	</label>
				<select class="form-control input-lg" >
					<option>Select User ID</option>
        			<option>Ankit</option>
         			<option>Arun</option>
    	     		<option>Tavleen</option>
	         		<option>Prince</option>
         			<option>Rohit</option>
         			<option>Chanki</option>
      			</select>
				</div>
			</td>
			</tr>
		
			<tr>
			<td>	
				<div class="form-group">
					<label class="white-XL-Label" for="password">Password</label>
					<input type="password" class="form-control input-lg" id="password"	placeholder="Password">
				</div>
			</td>
			</tr>
			
			<tr>
			<td>
				<div class="checkbox">
					<center><label for="1" class="white-Large-Label"><input type="checkbox" style="transform: scale(2);" class="checkbox" id="1"/>Remember Me</label></center>
				</div>
			</td>
			</tr>
			
			<tr>
				<td></br>	
				<div>
					<center><button type="submit" class="btn btn-primary btn-lg" style="width: 40%">Sign In</button><center>
						</div>
					</td>
				</tr>
				<tr>
			

			
			<div class="navbar navbar-inverse navbar-fixed-bottom">
				<div class="container"><p class="navbar-text pull-left">Site Built By Banana Group</p>
				</div>
			</div>
		</table>
		</form>
		<script src="resources/js/register.js"></script>
	</body>
</html>