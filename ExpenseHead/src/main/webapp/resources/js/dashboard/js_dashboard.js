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
		
		
		
		
	});
	 
	 
	 
	 
	 
	 
	 
	 
	 
