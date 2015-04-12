
<div id="settleDuesModal" class="modal fade" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true" style="top: 10%">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">X</button>
				<h3 id="myModalLabel">Settle Dues <span class="glyphicon glyphicon-info-sign" data-container="body" data-toggle="popover" data-placement="right" data-content="Enter amount received from pool." aria-hidden="true"></span></h3>
			</div>
			
			<div class="modal-body">
				<form role="form">
					<div class="form-inline form-inline-box">
						<div class="form-group">
							<label for="amount">Amount</label>
							<input type="number" class="form-control" id="settleDuesAmount" name="amount" placeholder="Enter Amount">
						</div>
					</div>
					<br/>
					<div class="form-group">
						<label for="description">Description</label>
						<textarea class="form-control" id="settleDuesDescription" rows="3"></textarea>
					</div>
				</form>
			</div>
			
			
			
			<div class="modal-footer">
				<button class="btn btn-default" data-dismiss="modal" aria-hidden="true">Cancel	</button>
				<button id="settleDues" name="submit" value="submit" class="btn btn-primary" data-dismiss="modal">Settle Dues</button>
			</div>
			
		</div>
	</div>
</div>