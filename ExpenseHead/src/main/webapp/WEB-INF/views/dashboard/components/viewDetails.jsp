<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="viewDetailsModal" class="modal fade" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true" style="top: 10%">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">X</button>
				<h3 id="myModalLabel">View Details <span class="glyphicon glyphicon-info-sign" data-container="body" data-toggle="popover" data-placement="right" data-content="Search transactions and expenses." aria-hidden="true"></span></h3>
			</div>
			
			<div class="modal-body">
				<form role="form">
					<div class="container form-inline form-inline-box" id="sandbox-container">
								
							<label for="amount">Search By Date</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<div class="input-daterange input-group" id="datepicker">
								<input id="fromDate" class="input-sm form-control" name="start" type="text"	placeholder="From Date"> 
								<span class="input-group-addon">-</span> 
								<input id="toDate" class="input-sm form-control" name="end" type="text" placeholder="To Date">
							</div>
					</div>
					<br>
					<div class="container form-inline form-inline-box" id="sandbox-container">
								
							<label for="amount">Search By User</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<select class="form-control" name="userList" id="userList" style="width:17%">
							</select>
					</div>
					<br>
					<div class="container form-inline form-inline-box" id="sandbox-container">
								
							<label for="amount">Search By Expense</label>&nbsp;
							<select class="form-control" name="expenseCategory" id="expenseCategory" style="width:17%">
								<option selected="true" value="All">All</option>
								<c:forEach items="${expenseTypes}" var="expenseType">
									<option value="${expenseType.key}">${expenseType.value}</option>
								</c:forEach>
							</select>
					</div>
					<br>
					<div class="modal-footer">
						<button class="btn btn-default" data-dismiss="modal" aria-hidden="true">Cancel</button>
						<button id="showDetails" name="submit" value="submit" class="btn btn-primary" data-dismiss="modal">Expense Details</button>
						<button id="showJournal" name="submit" value="submit" class="btn btn-primary" data-dismiss="modal">Transactions Details</button>
					</div>
					</form>
			</div>
		</div>
	</div>
</div>