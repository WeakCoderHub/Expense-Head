
<div id="addContributionModal" class="modal fade" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true" style="top: 10%">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">X</button>
				<h3 id="myModalLabel">Add Contribution</h3>
			</div>
			
			<div class="modal-body">
				<form role="form">
					<div class="form-inline form-inline-box">
						<div class="form-group">
							<label for="amount">Amount</label>
							<input type="number" class="form-control" id="contributionAmount" name="amount" placeholder="Enter Contribution Amount">
						</div>
					</div>
					<br/>
					<div class="form-inline form-inline-box">
						<label for="month">Month</label>
						<select class="form-control" name="month" id="monthContributed" style="width:30%">
							<option>1</option>
							<option>2</option>
						</select>
					</div>
					<br/>
					<div class="form-group">
						<label for="description">Description</label>
						<textarea class="form-control" id="contributionDescription" rows="3"></textarea>
					</div>
				</form>
			</div>
			
			
			
			<div class="modal-footer">
				<button class="btn btn-default" data-dismiss="modal" aria-hidden="true">Cancel	</button>
				<button id="addContribution" name="submit" value="submit" class="btn btn-primary" data-dismiss="modal">Add Contribution</button>
			</div>
			
		</div>
	</div>
</div>