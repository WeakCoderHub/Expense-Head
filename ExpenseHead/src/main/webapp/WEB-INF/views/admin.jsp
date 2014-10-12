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
	
	<title>Admin Page</title>
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
									<li><a style="font-size:large;" href="#">About 
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

		<div id="adminBody" class="col-sm-12">
		<div class="col-md-7">
		<div class="panel panel-default">
            <div id="pendingRequestTitle" class="panel-heading ">
              <h3 class="panel-title black-XL-Label">
              	<span class="glyphicon glyphicon-tasks pull-left">&nbsp;</span><b><i> Approvals</i></b><span class="glyphicon glyphicon-chevron-down pull-right"></span>
              </h3>
            </div>
            <div id="pendingRequests" style="display:none">
              <div class="panel-body ">
              <jsp:include page="pending_requests.jsp"></jsp:include>
              </div>
            </div>
         </div>
            
		<div class="panel panel-default">
            <div id="sendNotificatonsTitle" class="panel-heading">
              <h3 class="panel-title black-XL-Label">
              	<span class="glyphicon glyphicon-comment pull-left">&nbsp;</span><b><i>Send Notifications</i></b><span class="glyphicon glyphicon-chevron-down pull-right"></span>
              </h3>
            </div>
            <div id="sendNotificatons" style="display:none">
              <div class="panel-body">
              <jsp:include page="send_notifications.jsp"></jsp:include>
              </div>
            </div>
         </div>
            
				
		<div class="panel panel-default">
            <div id="distributeExpensesTitle" class="panel-heading">
              <h3 class="panel-title black-XL-Label">
              	<span class="glyphicon glyphicon-fullscreen pull-left">&nbsp;</span><b><i>Distribute Expenses From Pool</i></b><span class="glyphicon glyphicon-chevron-down pull-right"></span>
              </h3>
            </div>
            <div id="distributeExpenses" style="display:none">
              <div class="panel-body">
              <jsp:include page="distribute_expenses.jsp"></jsp:include>
              </div>
            </div>
         </div>
            		
			</div>	
				<div class="col-md-1" >
				
				</div>

			<div id="sideBar" class="col-sm-4" style="">
			<center><jsp:include page="side_content_modified.jsp"></jsp:include></center>
			</div>

		</div>
		


				<div class="navbar navbar-inverse navbar-fixed-bottom ">
					<div class="container">
						<p class="navbar-text pull-left">Site Built By Banana Group</p>
					</div>
				</div>
	</body>
	<script src="../js/register.js"></script>
</html>