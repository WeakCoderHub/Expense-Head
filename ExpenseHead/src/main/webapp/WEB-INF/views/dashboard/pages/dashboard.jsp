<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Dashboard</title>
</head>


<style type="text/css">
.modal-backdrop {
	top: 7% !important;
	left: 20% !important;
	right: 25% !important;
}

.myTable_wrapper_size {
	padding-top: 50px;
	padding-right: 380px;
	padding-left: 290px;
}
</style>

<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/font-awesome.min.css" rel="stylesheet">
<link href="resources/css/dashboard/css_dashboard.css" rel="stylesheet"
	type="text/css">
<link href="resources/css/datepicker/datepicker3.css" rel="stylesheet"
	type="text/css">
	<link href="resources/css/tables/jquery.dataTables.min.css" rel="stylesheet">
	<.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/tables/jquery.dataTables.min.js"></script>

<script src="resources/js/datepicker/bootstrap-datepicker.js"></script>

<body>
	<div class="header_height">
		<jsp:include page="/WEB-INF/views/dashboard/components/header.jsp"></jsp:include>
		<jsp:include
			page="/WEB-INF/views/dashboard/components/addExpenseModal.jsp"></jsp:include>
		<jsp:include
			page="/WEB-INF/views/dashboard/components/addContribution.jsp"></jsp:include>
			<jsp:include page="/WEB-INF/views/dashboard/components/settleDues.jsp"></jsp:include>
			<jsp:include page="/WEB-INF/views/dashboard/components/viewDetails.jsp"></jsp:include>
	</div>
	<input type="hidden" id="selectedDate" />
	<div style="width: 100%;" class="left-section">
		<div style="width: 20%;">
			<div class="span5 col-md-5" id="sandbox-container">
				<div id="dateSelector" style="margin: 35px 0px;"></div>
				<textarea id="stickyNote">This is a sticky note you can type and edit.
				</textarea>
				<button id="saveStickyNotes">Save Notes</button>
			</div>
		</div>
		<div></div>
		<div></div>
	</div>
	<div id="footer">
		@Copyright
		<div>Contact us : weakcoder@gmail.com</div>

	</div>

<div id="transactionDetails"></div>
<div id="journalDetails"></div>




</body>
<script type="text/javascript">
	 var eventDates= {};
// 	 eventDates = '${eventDates}';
     <c:forEach var="event" items="${eventDates}">
     eventDates['${event}'] = '${event}'; 
     </c:forEach>
/* 	var eventDates = {};
	eventDates[03+"/"+03+"/"+2015] = "03/03/2015";
	eventDates[03+"/"+04+"/"+2015] = "04/04/2015"; */
</script>
<script src="resources/js/dashboard/js_dashboard.js"></script>
</html>