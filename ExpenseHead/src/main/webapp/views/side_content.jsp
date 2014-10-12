<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="../css/login.css">
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<script src="../js/bootstrap.js"></script>

<title></title>
</head>
<body >

<table class="white-text" >
<tr><td colspan="2"><label class="sideLabel"> Total Amount</label><br><br></td></tr>
     <tr>
     <td class="sideLabels">Pool :</td> <td class="side_content_value"><c:out value="${currentPool }" />Rs. 10000</td>
     </tr>
     <tr>
     <td class="sideLabels">Return :</td><td class="side_content_value"><c:out value="${TotalPendingPayback}" />Rs. 2000</td>
     </tr>
    <tr>
     <td class="sideLabels" >Expenses :</td> <td class="side_content_value"><c:out value="${totalExpenses}" />Rs. 8000</td>
    </tr>
    <tr>
   <td><a href=""><b>View Details</b></a></td>
</tr>
</table >
<br><br><br>
<table class="white-text" >
<tr><td colspan="2"><label class="sideLabel">My Contribution</label><br><br></td></tr>
<tr><td class="sideLabels">Pool :</td> <td class="side_content_value"><c:out value="${UserPoolAmount }" />Rs. 2000</td>
</tr>
<tr>
<td class="sideLabels">Expenses :</td> <td class="side_content_value"><c:out value="${userpendingPayback }" ></c:out>Rs. 700</td>
</tr>
<tr>
<td><a href=""><b>View Details</b></a></td>
</tr>
</table>

</body>
</html>