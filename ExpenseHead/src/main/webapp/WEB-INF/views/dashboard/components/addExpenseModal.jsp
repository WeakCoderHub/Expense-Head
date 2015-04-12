<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="addExpenseModal" class="modal fade" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true" style="top: 10%">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">X</button>
				<h3 id="myModalLabel">Add Expense <span class="glyphicon glyphicon-info-sign" data-container="body" data-toggle="popover" data-placement="right" data-content="Add your daily expenses here." aria-hidden="true"></span></h3>
			</div>
			
			<div class="modal-body">
				<form role="form" style="margin-left:10px;">
					<div class="form-inline form-inline-box">
						<div class="form-group">
							<label for="amount">Amount</label>&nbsp;
							<input type="number" class="form-control" id="expenseAmount" name="amount" placeholder="Expense Amount" style="width:70%">
						</div>
						
						<label for="expenseType">Expense Type</label>

							<select class="form-control" name="expenseType" id="expenseType" style="width:25%">
								<c:forEach items="${expenseTypes}" var="expenseType">
									<option value="${expenseType.key}">${expenseType.value}</option>
								</c:forEach>
						</select>
					</div>
					<br/>
					<div class="form-group pool">
						<label for="pool">The amount was spent from pool?</label>&nbsp&nbsp&nbsp&nbsp<input type="checkbox" name="pool" id="pool" checked data-off-class="btn-primary" data-on-class="btn-primary" >
					</div>
					
					<div class="form-group">
						<label for="description">Description (Optional)</label>
						<textarea class="form-control" id="description" rows="3"></textarea>
					</div>
				</form>
			</div>
			
			
			
			<div class="modal-footer">
				<button class="btn btn-default" data-dismiss="modal" aria-hidden="true">Cancel	</button>
				<button id="addExpense" name="submit" value="submit" class="btn btn-primary" data-dismiss="modal">Add Expense</button>
			</div>
			
		</div>
	</div>
</div>