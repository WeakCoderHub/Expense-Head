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
	<table align="left" >
   <thead >
      <tr class="white-Large-Label">
         <th class="col-sm-2"></th>
         <th class="col-sm-3"></th>
         <th class="col-sm-1"></th>
         <th class="col-sm-3"></th>
         <th class="col-sm-2"></th>
      </tr>
   </thead>
   <tbody id="pendingRequestsListBody">
      
      <tr>
      <td><span class="black-XL-Label"><i>Pay Back</i></span></td>
      <td><input type="text" class="form-control" id="groupname" placeholder="Amount"></td>
      <td><span class="black-XL-Label">&nbsp;&nbsp;&nbsp;<i>to</i></span></td>
      <td>
      		<select class="form-control input-sm" >
					<option>Select User ID</option>
        			<option>Ankit</option>
         			<option>Arun</option>
    	     		<option>Tavleen</option>
	         		<option>Prince</option>
         			<option>Rohit</option>
         			<option>Chanki</option>
      		</select>
      </td>
      <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="button"  class="btn btn-success btn-sm deleteMember" onclick="deleteRow(this)"><span class="glyphicon glyphicon-ok"></span> Pay Back</button></td>
      </tr>
   </tbody>
</table>
		
	</body>
	
</html>