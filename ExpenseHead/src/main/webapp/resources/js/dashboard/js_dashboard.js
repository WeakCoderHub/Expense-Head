 $(document).ready(function(){

	
	 
		// adding Expense in database
		$("#addExpense").click(function() {
			var obj = {};
			obj.amount = $("#expenseAmount").val();
			obj.expenseType = $("#expenseTypeId").val();
			obj.description = $("#description").val();
			obj.pool=$('#pool').prop("checked");
			var jsonRequest = JSON.stringify(obj);
			$.ajax({
				type : "POST",
				url : "addExpense",
				data : jsonRequest,
				contentType : "application/json; charset=utf-8",
				dataType : "json",
				success : function(data) {
					alert("success");
				},
				failure : function(data) {
					alert("failure");
				}
			});
		});
		
		// adding Contribution in database
		$("#addContribution").click(function() {
			var obj = {};
			obj.contributionAmount = $("#contributionAmount").val();
			obj.monthContributed = $("#monthContributed").val();
			obj.contributionDescription = $("#contributionDescription").val();
			var jsonRequest = JSON.stringify(obj);
			$.ajax({
				type : "POST",
				url : "addContribution",
				data : jsonRequest,
				contentType : "application/json; charset=utf-8",
				dataType : "json",
				success : function(data) {
					alert("success");
				},
				failure : function(data) {
					alert("failure");
				}
			});
		});
		
		$("#settleDues").click(function() {
			var obj = {};
			obj.settleDuesAmount = $("#settleDuesAmount").val();
			obj.settleDuesDescription = $("#settleDuesDescription").val();
			var jsonRequest = JSON.stringify(obj);
			$.ajax({
				type : "POST",
				url : "settleDues",
				data : jsonRequest,
				contentType : "application/json; charset=utf-8",
				dataType : "json",
				success : function(data) {
					alert("success");
				},
				failure : function(data) {
					alert("failure");
				}
			});
		});
		
		
		$('#showDetails').click(function() {
			$.ajax({
						type : "GET",
						url : "getExpenseDetails",
						dataType : "text",
						success : function(data) {
							var obj = jQuery.parseJSON(data);
							var len = Object.keys(obj).length;

							var html = '<table id="myTable" class="table table-striped table-bordered">';
							html+='<thead><tr><th>S.No.</th><th>User Id</th><th>Amount</th><th>Entry Date</th><th>Description</th></tr></thead><tbody>';  
					     
							for (var i = 1; i <= len; i++) {
								html += '<tr>'
									 +'<td>'+i+'</td>'  
						             +'<td>'+obj[i].userId+'</td>'  
						             +'<td>'+obj[i].amount+'</td>'  
						             +'<td>'+obj[i].entryDate+'</td>'  
						             +'<td>'+obj[i].discription+'</td>' 
						             +'</tr>';
								
							}
								html += '</tbody></table>';
								$('#transactionDetails').html(html);
								$('#myTable').dataTable();
								$("#myTable_wrapper").addClass("myTable_wrapper_size");
							}
						});
					});
		
		$('#showJournal').click(function() {
			$.ajax({
						type : "GET",
						url : "getJournalDetails",
						dataType : "text",
						success : function(data) {
							var obj = jQuery.parseJSON(data);
							var len = Object.keys(obj).length;

							var html = '<table id="myTable1" class="table table-striped table-bordered">';
							html+='<thead><tr><th>S.No.</th><th>User Id</th><th>Credit</th><th>Debit</th><th>Record Date</th></tr></thead><tbody>';  
					     
							for (var i = 1; i <= len; i++) {
								html += '<tr>'
									 +'<td>'+i+'</td>'  
						             +'<td>'+obj[i].userId+'</td>'  
						             +'<td>'+obj[i].credit+'</td>'  
						             +'<td>'+obj[i].debit+'</td>'  
						             +'<td>'+obj[i].recordDate+'</td>' 
						             +'</tr>';
								
							}
								html += '</tbody></table>';
								$('#journalDetails').html(html);
								$('#myTable1').dataTable();
								$("#myTable1_wrapper").addClass("myTable_wrapper_size");
							}
						});
					});
		
		
		
	});
	 
	 
	 
	 
	 
	 
	 
	 
	 
