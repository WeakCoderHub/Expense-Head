$(document)
		.ready(
				function() {
					 
					$('#sandbox-container div').datepicker({
						/*
						 * beforeShowDay: function(date) { // var highlight =
						 * eventDates[date]; var highlight = new
						 * Date(2015,03,15); if (true) { return [true, "event",
						 * highlight]; } else { return [true, '', '']; } },
						 */
						format : "dd/mm/yyyy",
						multidate : false,
						daysOfWeekDisabled : "0",
						todayHighlight : true,
						calendarWeeks : true,
						
						beforeShowDay : function(date) {
							var month = date.getMonth()+1;
							if(month<10)
								month="0"+month;
							var day = date.getDate();
							if(day<10)
								day="0"+day;
							var year = date.getFullYear();
							var highlight = eventDates[day+"/"+month+"/"+year];
							if(highlight){
							return {
								tooltip : 'Selected Date',
								classes : 'event'
							};
							}
							else{
								return "";
							}
						}
					});

					$('#stickyNote').focusout(function() {

					});

					$('#dateSelector').click(function() {

						var dateSelected = $(this).datepicker('getUTCDate');
						$('#selectedDate').val(dateSelected);
						
						var month = dateSelected.getMonth() + 1;
						var date = dateSelected.getDate() + "/"
								+ month + "/"
								+ dateSelected.getFullYear();
						
						$.ajax({
							type : 'POST',
							url  : 'getStickyNote',
							data :  date,
							contentType : "application/json; charset=utf-8",
							success : function(data){
								// Message is added in Sticky note.
								$('#stickyNote').val(data);
							},
							error : function(){
								$('#stickyNote').val("This is a sticky note you can type and edit.");
							}
						});
					});

					$('#saveStickyNotes')
							.click(
									function() {
										var obj = {};

										dateSelected = new Date($(
												'#selectedDate').val());
										if (dateSelected == "Invalid Date") {
											dateSelected = new Date();
										}
										var month = dateSelected.getMonth() + 1;
										obj.date = dateSelected.getDate() + "/"
												+ month + "/"
												+ dateSelected.getFullYear();
										obj.message = $('#stickyNote').val();

										var jsonRequest = JSON.stringify(obj);
										$
												.ajax({
													type : 'POST',
													url : "saveNotes",
													data : jsonRequest,
													contentType : "application/json; charset=utf-8",
													dataType : "json",
													success : function(data) {
														location.reload(true);
													},
													error : function(data) {
														alert("error");
													},
													failure : function(data) {
														alert("failure");
													}
												});
									});

					// adding Expense in database
					$("#addExpense").click(function() {
						var obj = {};
						obj.amount = $("#expenseAmount").val();
						obj.expenseType = $("#expenseTypeId").val();
						obj.description = $("#description").val();
						obj.pool = $('#pool').prop("checked");
						var jsonRequest = JSON.stringify(obj);
						$.ajax({
							type : "POST",
							url : "addExpense",
							data : jsonRequest,
							contentType : "application/json; charset=utf-8",
							dataType : "json",
							success : function(data) {
								retrieveSummary();
							},
							failure : function(data) {
								alert("failure");
							}
						});
					});

					// adding Contribution in database
					$("#addContribution")
							.click(
									function() {
										var obj = {};
										obj.contributionAmount = $(
												"#contributionAmount").val();
										obj.monthContributed = $(
												"#monthContributed").val();
										obj.contributionDescription = $(
												"#contributionDescription")
												.val();
										var jsonRequest = JSON.stringify(obj);
										$
												.ajax({
													type : "POST",
													url : "addContribution",
													data : jsonRequest,
													contentType : "application/json; charset=utf-8",
													dataType : "json",
													success : function(data) {
														retrieveSummary();
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
					retrieveSummary();
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
		
		
		function retrieveSummary(){
			$.ajax({
						type : "GET",
						url : "getSummary",
						dataType : "text",
						success : function(data) {
							var obj = jQuery.parseJSON(data);
							var len = Object.keys(obj.memberSummary).length;

							var html = '<table class="table table-hover">';
							html+='<thead><tr><th>Member</th><th>Payable</th><th>Payback</th></thead><tbody>';  
					     
							for (var i = 0; i < len; i++) {
								html += '<tr>'  
						             +'<td>'+obj.memberSummary[i].memberName+'</td>'  
						             +'<td>'+obj.memberSummary[i].payable+'</td>'  
						             +'<td>'+obj.memberSummary[i].payback+'</td>' 
						             +'</tr>';
								
							}
								html += '</tbody></table>';
								$('#membersSummary').html(html);
								$('#totalDepositsSummary').html(obj.totalDeposits);
								$('#balanceSummary').html(obj.balance);
								$('#expensesSummary').html(obj.expenses);
							}
						});
					} 
		
		retrieveSummary();
		
	});
	 
	
	 
	 
	 
	 
	 
	 
	 
