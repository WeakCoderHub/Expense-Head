<div id="header"
			class="header navbar navbar-default navbar-fixed-top navbar-inverse">
			<div class="container-fluid" style="margin-right: -5%;padding-left:0%;">
			
				<ul class="nav navbar-nav" style="color:white; margin-left:15%;padding-right:20%;padding-left:5%;">
				<li>
				<form class="navbar-form full-width" >
					<a href="#addExpenseModal" role="button" class="btn" data-toggle="modal"><i class="fa fa-plus" style="color:white;font-size: 20px;"> Add Expense</i></a>
				</form>
				</li>
				
				<li>
				<form class="navbar-form full-width" style="padding-top:0%;">
					<a href="#addContributionModal" role="button" class="btn" data-toggle="modal"><i class="fa fa-plus" style="color:white;font-size: 20px;"> Add Contribution</i></a>
				</form>
				</li>
				
				
				</ul>
				
							
			
			
				<ul class="nav navbar-nav navbar-right"><!--
					
								<!--Search Box-->
					<li>
						<form class="navbar-form full-width">
							<div class="form-group">
								<input type="text" class="form-control"	placeholder="Enter keyword">
								<button type="submit" class="btn btn-search"><i class="fa fa-search"></i></button>
							</div>
						</form>
					</li>
					
								<!--Notifications-->
					<li class="dropdown">
						<a href="javascript:;" data-toggle="dropdown"
							class="dropdown-toggle f-s-14"> <i class="fa fa-bell-o fa-lg"></i>
							<span class="label">2</span> </a>
								<jsp:include page="notificationBar.jsp"></jsp:include>
					</li>
					
					<li class="dropdown navbar-user ">
						<a href="#" class="dropdown-toggle"	data-toggle="dropdown" aria-expanded="true"> 
						<img src="resources/images/1409936270962.jpg" class="img-rounded"  width="5%" alt="">
							<span class="hidden-xs">Rohit Singla</span> <b class="caret"></b>
						</a>
						<ul class="dropdown-menu animated fadeInLeft" style="right:55.5%">
							<li class="arrow"></li>
							<li>
								<a href="#">Edit Profile</a>
							</li>
							<li>
								<a href="#"><span class="badge badge-danger pull-right">2</span> Inbox</a>
							</li>
							<li>
								<a href="#">Setting</a>
							</li>
							<li class="divider">#</li>
							<li>
								<a href="#">Log Out</a>
							</li>
						</ul>
					</li>
				</ul>
			</div>
		</div>