<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>Dashboard</title>
	</head>


	<style type="text/css">
.modal-backdrop {
	top: 5.5% !important;
	left: 18% !important;
	right: 18% !important;
}
</style>

	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="resources/css/font-awesome.min.css" rel="stylesheet">
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>

	<body>
		<div>
			<jsp:include page="/WEB-INF/views/dashboard/components/header.jsp"></jsp:include>
			<jsp:include page="/WEB-INF/views/dashboard/components/addExpenseModal.jsp"></jsp:include>
			<jsp:include page="/WEB-INF/views/dashboard/components/addContribution.jsp"></jsp:include>

		</div>


	</body>
</html>