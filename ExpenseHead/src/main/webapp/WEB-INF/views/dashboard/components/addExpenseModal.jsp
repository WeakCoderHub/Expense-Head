
<div id="addExpenseModal" class="modal fade" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true" style="top: 10%">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">X</button>
				<h3 id="myModalLabel">Add Expense</h3>
			</div>
			
			<div class="modal-body">
				<form role="form">
					<div class="form-inline form-inline-box">
						<div class="form-group">
							<label for="amount">Amount</label>
							<input type="number" class="form-control" id="expenseAmount" name="amount" placeholder="Enter Expense Amount">
						</div>
						<div class="form-group">
							&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<label for="pool">Pool</label>&nbsp&nbsp&nbsp&nbsp<input type="checkbox" name="pool" id="pool">
						</div>
					</div>
					<br/>
					<div class="form-inline form-inline-box">
						<label for="expenseType">Expense Type</label>
						<select class="form-control" name="expenseType" id="expenseType" style="width:30%">
							<option>Active</option>
							<option>Inactive</option>
						</select>
					</div>
					<br/>
					<div class="form-group">
						<label for="description">Description</label>
						<textarea class="form-control" id="description" rows="3"></textarea>
					</div>
				</form>
			</div>
			
			
			
			<div class="modal-footer">
				<button class="btn btn-default" data-dismiss="modal" aria-hidden="true">Cancel	</button>
				<button id="addToDB" name="submit" value="submit" class="btn btn-primary" data-dismiss="modal">Add Expense</button>
			</div>
			
		</div>
	</div>
</div>