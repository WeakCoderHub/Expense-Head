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

				});
