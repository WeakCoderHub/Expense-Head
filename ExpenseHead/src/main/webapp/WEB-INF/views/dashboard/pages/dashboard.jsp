<!DOCTYPE html>
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
	<link href="resources/css/tables/jquery.dataTables.min.css" rel="stylesheet">
	<script	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/dashboard/js_dashboard.js"></script>
	<script src="resources/js/tables/jquery.dataTables.min.js"></script>

	<body>
		 <div>
			<jsp:include page="/WEB-INF/views/dashboard/components/header.jsp"></jsp:include>
			<jsp:include page="/WEB-INF/views/dashboard/components/addExpenseModal.jsp"></jsp:include>
			<jsp:include page="/WEB-INF/views/dashboard/components/addContribution.jsp"></jsp:include>
			<jsp:include page="/WEB-INF/views/dashboard/components/settleDues.jsp"></jsp:include>
			<jsp:include page="/WEB-INF/views/dashboard/components/viewDetails.jsp"></jsp:include>
		</div>


<div id="transactionDetails"></div>
<div id="journalDetails"></div>




	</body>
</html>