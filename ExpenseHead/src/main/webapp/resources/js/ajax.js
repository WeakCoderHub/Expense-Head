$(document)
		.ready(
				function() {

					$('#groupid')
							.focusout(
									function() {
										var groupName = $('#groupid').val();
										dataString = "groupName=" + groupName;
										$
												.ajax({
													type : "GET",
													url : "getUserList",
													data : dataString,
													dataType : "text",
													success : function(data) {
														var obj = jQuery
																.parseJSON(data);
														var len = obj.length;

														var html = '<option value="">Select User</option>';
														for (var i = 0; i < len; i++) {
															html += '<option value="'
																	+ obj[i]
																	+ '">'
																	+ obj[i]
																	+ '</option>';
															html += '</option>';
															$('#userNames')
																	.html(html);
														}
													}
												});
									});

					$('#expenseAmount')
							.focusout(
									function() {

										$
												.ajax({
													type : "GET",
													url : "expensetypes",
													dataType : "text",
													success : function(data) {
														var obj = jQuery
																.parseJSON(data);

														var len = obj.length;
														var html = '<option value="">Select Type</option>';
														for (var i = 0; i < len; i++) {
															html += '<option value="'
																	+ obj[i]
																	+ '">'
																	+ obj[i]
																	+ '</option>';
															html += '</option>';
															$('#expenseTypeId')
																	.html(html);

														}
													}
												});
									});

					// adding Expense in database
					$("#addToDB").click(function() {
						var obj = {};
						obj.amount = $("#expenseAmount").val();
						obj.expenseType = $("#expenseTypeId").val();
						obj.description = $("#description").val();

						if ($('#pool').prop("checked") == true) {
							obj.pool = "true";

						} else if ($('#pool').prop("checked") == false) {
							obj.pool = "false";

						}

						var jsonRequest = JSON.stringify(obj);
						$.ajax({
							type : "POST",
							url : "addExpense",
							data : jsonRequest,
							contentType : "application/json; charset=utf-8",
							dataType : "json",
							success : function(data) {
								$("#popupBackground").fadeOut("slow");
								$("#popupForm").fadeOut("slow");
								$("#forPopupUse").val("true");
							},
							failure : function(data) {
								$("#popupBackground").fadeOut("slow");
								$("#popupForm").fadeOut("slow");
								$("#forPopupUse").val("true");
							}
						});
					});

				});
