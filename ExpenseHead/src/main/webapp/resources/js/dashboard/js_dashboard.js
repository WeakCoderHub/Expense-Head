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
								alert(data);
								
								// need to add message to sticky note.
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
														alert("success");
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
								alert(data);
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
														alert("success");
													},
													failure : function(data) {
														alert("failure");
													}
												});
									});
				});
