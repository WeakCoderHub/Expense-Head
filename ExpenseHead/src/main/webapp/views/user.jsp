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
		<script src="../js/bootstrap.js"></script>
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

		<title>User Page</title>
	</head>
	<body class="pattern pattern4">
		<div class="navbar navbar-inverse navbar-static">
			<div class="container">
		
				 <b class="navbar-brand" style="color: white;">Welcome User</b>

				<div class="collapse navbar-collapse navHeaderCollapse">
					<!--<ul class="nav navbar-nav navbar-right">
						<li>
							<a style="font-size:large;">Register <span class="glyphicon glyphicon-registration-mark"></span> </a>
						</li>
						<li>
							<a style="font-size:large;" href="#">About <span class="glyphicon glyphicon-info-sign"></span></a>
						</li>
					</ul>
					
				-->
				
				
<ul class="nav navbar-nav navbar-right">
                <li class="hidden-xs"><a class="dropdown-toggle" href="javascript:;" data-toggle="dropdown" title="Notifications"><span style="content : \f2f3;"><span class="count-circle count-circle-middle slide-up">1</span></span></a>
                    <div class="dropdown-menu spacer5" style="min-width:250px;">
                        <div class="list-group margin-bottom-5">
                           <a href="javascript:;" class="list-group-item small"><span class="badge bg-warning pulse">5</span> Logging overages in sector C.</a>
                           <a href="javascript:;" class="list-group-item small"><span class="badge bg-danger">14</span> <span class="text-warning">Users with request timed out.</span></a>
                           <a href="javascript:;" class="list-group-item small"><span class="badge bg-success">0</span> Service errors since 12:01AM.</a>
                           <a href="javascript:;" class="list-group-item small"><span class="badge">1</span> Blade server pending backup.</a>
                        </div>
                        <p class="text-center"><a href="/user-profile" class="small">All notifications</a></p>
                    </div>
                </li>
                <li class="hidden-xs"><a class="dropdown-toggle" href="javascript:;" data-toggle="dropdown" title="Messages"><span class="fa fa-envelope fa-lg"><span class="count-circle count-circle-middle count-circle-red">3</span></span></a>
                    <div class="dropdown-menu spacer5" style="min-width:250px;">
                        <ul class="list-group margin-bottom-5">
                           <li class="list-group-item small">FW: All developers on the Trello..</li>
                           <li class="list-group-item small">Notice from corporate---- Your HR..</li>
                           <li class="list-group-item small">Hi Joe, I left the keys for the..</li>
                           <li class="list-group-item small">All, The SPG group will meet every..</li>
                        </ul>
                        <p class="text-center"><a href="/inbox" class="small">All messages</a></p>
                    </div>
                </li>
                <li class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" style="padding-top:7px;padding-bottom:6px;">
                    <img width="36px" class="img-rounded" src="http://api.randomuser.me/portraits/men/4.jpg"> 
                  </a>
                  <ul class="dropdown-menu pull-right">
                    <li><a href="/user-profile"><i class="pull-right glyphicon glyphicon-cog"></i> Settings</a></li>
                    <li><a href="" data-toggle="modal" data-target="#modalLogout"><i class="pull-right glyphicon glyphicon-lock"></i> Log Out</a></li>
                  </ul>
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

<!-- -----------------------------------admin -->





<!-- ------------------------------- -->

		<form role="form">
			<table align="center" width="40%" style="margin-top: 13em;">
			<tr>
			<td>
				<div class="form-group">
					<label class="white-XL-Label" for="groupId">Group ID</label>
					<input type="text" class="form-control input-lg" id="groupId" placeholder="Enter Group ID">
				</div>
</td>
</tr><tr><td>
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
			</td></tr>
		<tr><td>	
				<div class="form-group">
					<label class="white-XL-Label" for="password">Password</label>
					<input type="password" class="form-control input-lg" id="password"	placeholder="Password">
				</div>
</tr><td></td>
<tr><td>				<div class="checkbox">
						<label for="1" class="white-medium-Label"><input type="checkbox" class="checkbox" id="1"/>
						Remember Me</label>
				</div>

				<button type="submit" class="btn btn-primary btn-lg">Log In	</button>
			</div>
</tr></td>
<tr><td>
			<div class="navbar navbar-inverse navbar-fixed-bottom">
				<div class="container">
					<p class="navbar-text pull-left">
						Site Built By Banana Group
					</p>
			
			</div></div></td></tr></table>
		</form>
		<script src="../js/register.js"></script>
	</body>
</html>