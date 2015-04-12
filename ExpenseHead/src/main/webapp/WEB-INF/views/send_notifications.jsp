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
         <th class="col-sm-12"></th>
      </tr>
   </thead>
   <tbody id="notificationsBody">
      
      <tr>
      <td>
		<input type="text" class="form-control" id="groupname"	placeholder="Send Notification To">
	  </td>
      </tr>
      
      
      
 	 <tr>      
 	 <td>
			<textarea rows="8" cols="50" placeholder="Start typing the notification text..." class="form-control"></textarea> 			

	 </td>
      </tr>
      
      
      
      <tr>
      <td><center><button type="submit" class="btn btn-primary btn-md" style="width: 40%">Send Notification</button><center></td>
      </tr>
   </tbody>
</table>
		
	</body>
	
</html>