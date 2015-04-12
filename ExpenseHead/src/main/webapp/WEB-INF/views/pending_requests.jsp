<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type"
			content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="../css/login.css">
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

		<script src="../js/bootstrap.js"></script>
		<title></title>
	</head>	
	
	<body>
	<table align="left" class="table">
   <thead >
      <tr class="white-Large-Label">
         <th class="col-sm-2"></th>
         <th class="col-sm-2"></th>
         <th class="col-sm-2"></th>
         <th class="col-sm-1"></th>
         <th class="col-sm-2"></th>
         <th class="col-sm-1"></th>
         <th class="col-sm-1"></th>
      </tr>
   </thead>
   <tbody id="pendingRequestsListBody">
      
      <tr class="notify-well">
      <td><img src="http://api.randomuser.me/portraits/men/11.jpg" style="width:40px;" class="img-rounded"><span class="black-Large-Label"><b> Arun Garg</b></span></td>
      <td><span class="black-XL-Label"><i>requests</i></span></td>
      <td><span class="black-XL-Label"><b>Rs 200</b></span></td>
      <td><span class="black-XL-Label"><i>for</i></span></td>
      <td><span class="black-XL-Label"><b>Milk</b></span></td>
      <td><button type="button"  class="btn btn-success btn-sm deleteMember" onclick="deleteRow(this)"><span class="glyphicon glyphicon-ok"></span> Accept</button></td>
      <td><button type="button"  class="btn btn-danger btn-sm deleteMember" onclick="deleteRow(this)"><span class="glyphicon glyphicon-remove"></span> Decline</button></td>
      </tr>
      <tr><td>     </td></tr>
 	 <tr class="notify-success">
      <td><img src="http://api.randomuser.me/portraits/men/11.jpg" style="width:40px;" class="img-rounded"><span class="white-Large-Label"> Arun Garg</span></td>
      <td><span class="white-Large-Label">requests</span></td>
      <td><span class="white-Large-Label">Rs 200</span></td>
      <td><span class="white-Large-Label">For</span></td>
      <td><span class="white-Large-Label">Milk</span></td>
      <td><button type="button"  class="btn btn-success btn-sm deleteMember" onclick="deleteRow(this)"><span class="glyphicon glyphicon-ok"></span> Accept</button></td>
      <td><button type="button"  class="btn btn-danger btn-sm deleteMember" onclick="deleteRow(this)"><span class="glyphicon glyphicon-remove"></span> Decline</button></td>
      </tr>
   </tbody>
</table>
		
	</body>
	
</html>