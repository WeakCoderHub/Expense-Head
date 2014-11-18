<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type"
			content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="../css/login.css">
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

		<script src="../js/bootstrap.js"></script>
	
		
		

		<title>Register Your Group</title>
	</head>	
	<body class="pattern pattern4">
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



		<form class="form-horizontal" role="form">
			<table align="center" width="50%" style="margin-top: 2em;">
			<tr>
			<td>
				<div class="form-group">
					<label for="groupname" class="col-sm-2 control-label white-Large-Label">Group Name</label>
					<div class="col-sm-9">	<input type="text" class="form-control" id="groupname"	placeholder="Enter Group Name">	</div>
				</div>
				</br>
			</td>
			</tr>
			
			
		<tr><td>	
				<div id="addMembersDetails" class="form-group">

	<table align="center" class="table">
 
   <thead >
      <tr class="white-Large-Label">
         <th class="col-sm-1">SNo.</th>
         <th class="col-sm-3">Name</th>
         <th class="col-sm-3">Email ID</th>
         <th class="col-sm-3">Contact No</th>
         <th class="col-sm-1">Admin</th>
         <th class="col-sm-1"></th>
      </tr>
   </thead>
   <tbody id="memberDetailBody">
      <tr><td class="white-Large-Label">1.</td>
      <td><input type="text" class="form-control" id="memberName1" placeholder="Enter Name"></td>
      <td><input type="text" class="form-control" id="memberEmailId1"	placeholder="Enter Email ID"></td>
      <td><input type="text" class="form-control" id="contactNo1"	placeholder="Enter Contact No."></td>
      <td style="padding-top: 1.1em; padding-left: 0.8em "><input type="radio" name="isAdmin" checked="checked" style="transform: scale(2);"></td>
      <td><button type="button"  class="btn btn-danger btn-sm deleteMember" onclick="deleteRow(this)"><span class="glyphicon glyphicon-minus"></span></button></td>
      </tr>
 	 
 	  <tr><td class="white-Large-Label">2.</td>
      <td><input type="text" class="form-control" id="memberName2" placeholder="Enter Name"></td>
      <td><input type="text" class="form-control" id="memberEmailId2"	placeholder="Enter Email ID"></td>
      <td><input type="text" class="form-control" id="contactNo2"	placeholder="Enter Contact No."></td>
      <td style="padding-top: 1.1em; padding-left: 0.8em"><input type="radio" name="isAdmin" style="transform: scale(2);"></td>
      <td><button type="button"  class="btn btn-danger btn-sm deleteMember" onclick="deleteRow(this)"><span class="glyphicon glyphicon-minus"></span></button></td>
      </tr> 
   </tbody>
</table>
</div>
</td>
</tr>

		<tr>
		<td>
		<div>
		<center><button type="button" id="addMember" class="btn btn-success btn-sm"> Add Members  <span class="glyphicon glyphicon-plus"></span></button></center>
		</div>
        </td>
		</tr>
		
		<tr><td><br/><br/></td></tr>
			<tr>
			<td>
				<div class="form-group">
					<label for="address" class="col-sm-2 control-label white-Large-Label">Address</label>
					<div class="col-sm-9">	<input type="text" class="form-control" id="address" placeholder="Enter Address">	</div>
				</div>
			</td>
			</tr>	
		
		
			<tr>
			<td>
				<div class="form-group">
					<label for="contact1" class="col-sm-2 control-label white-Large-Label">Mobile No. 1</label>
					<div class="col-sm-4"><input type="text" class="form-control" id="contact1" placeholder="Enter Mobile No. 2">	</div>
				</div>
			</td>
			
			</tr>	
		
			<tr>
			<td>
				<div class="form-group">
					<label for="contact2" class="col-sm-2 control-label white-Large-Label">Mobile No. 2</label>
					<div class="col-sm-4"><input type="text" class="form-control" id="contact2" placeholder="Enter Mobile No. 2">	</div>
				</div>
			</td>
			</tr>
		
		
				
				<tr>
				<td>
				</br></br></br>	
				<div>
					<center><button type="submit" class="btn btn-primary btn-lg" style="width: 40%">Create My Group</button><center>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="navbar navbar-inverse navbar-fixed-bottom">
							<div class="container">
								<p class="navbar-text pull-left">
									Site Built By Banana Group
								</p>

							</div>
						</div>
					</td>
				</tr>
			</table>
		</form>
				
	</body>
	<script src="../js/register.js"></script>
</html>