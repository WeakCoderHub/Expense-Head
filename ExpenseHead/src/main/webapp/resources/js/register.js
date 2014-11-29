  $(document).ready(function(){
	  
/*$("#pendingRequestTitle").click(function()
	{
	$("#pendingRequests").slideToggle();
		
	});

$("#sendNotificatonsTitle").click(function()
		{
		$("#sendNotificatons").slideToggle();
			
		});

$("#distributeExpensesTitle").click(function()
		{
		$("#distributeExpenses").slideToggle();
		$("#userReturnDetails").slideToggle();	
		});

$("#totalAmountPool").click(function()
		{
		$("#userContributionDetails").slideToggle("fast");
			
		});

$("#totalAmountReturn").click(function()
		{
		$("#userReturnDetails").slideToggle();
			
		});

$("#totalAmountExpenses").click(function()
		{
		$("#expenseDetails").slideToggle();
			
		});

$("#myContributionExpenses").click(function()
		{
		$("#userExpenseDetails").slideToggle();
			
		}); 
*/
$("#addMember").click(function(){
	var i=($('#memberDetailBody').children().length)+1;
	var rows ='<tr><td>'+i+'.</td><td><input type="text" class="input-box" id="memberName'+i+'" placeholder="Enter Name"></td><td><input type="text" class="input-box" id="memberEmailId'+i+'"	placeholder="Enter Email ID"></td><td><input type="text" class="input-box" id="contactNo'+i+'"	placeholder="Enter Contact No."></td><td><input type="radio" class="css-checkbox" name="isAdmin" id="radio'+i+'"><label for="radio'+i+'"class="css-label"></label></td> <td><a href="#" onclick="deleteRow(this)"><div class="minus-sign"></div></a></td></tr>';    		  
		$(rows).appendTo('#memberDetailBody');   
});



//function deleteRow(tableID) {
//    try {
//    var table = document.getElementById(tableID);
//    var rowCount = table.rows.length;
//
//    for(var i=0; i<rowCount; i++) {
//        var row = table.rows[i];
//        var chkbox = row.cells[0].childNodes[0];
//        if(null != chkbox && true == chkbox.checked) {
//            table.deleteRow(i);
//            rowCount--;
//            i--;
//        }
//
//
//    }
//    }catch(e) {
//        alert(e);
//    }
//}

$("#createMyGroup").click(function(){
	
	  var request = {};
	  request["groupName"] = $("#groupname").val();
	  request["address"] = $("#address").val();
	  request["listOfMembers"] = [];
	  $('#membersTable tr').each(function(){
		  var data = $(this).eq(0).children('td');
		  var user = {};
		 	user["userName"] = data.eq(1).children('input').val();
		 	user["emailId"] = data.eq(2).children('input').val();
		 	user["contactNo"] = data.eq(3).children('input').val();
		 	user["isAdmin"] = data.eq(4).children('input').prop("checked");
		 	request.listOfMembers.push(user);     
	  });
	  var jsonRequest = JSON.stringify(request);
	  $.ajax({
			type: "GET",
          url: "createGroup",
          type: "POST",
          data: jsonRequest,
          dataType: "json",
          contentType: "application/json",
		      success: function(data) {alert("success");}
		});
	  
	  
		});



  });

  function deleteRow(row){
		 
		$(row).parent().parent().remove();
		$('#membersTable tr').each(function(){
			  
		  });
		  
	}

 
  

 /* $("#noofmembers").change(function(){
  
	var times = $("#noofmembers  :selected").val();
	$('#testing').empty();
    for( i=1;i<=times;i++)
    {
		var rows ='<tr><td>'+i+'</td><td><input type="text" class="form-control" id="memberName'+i+'" placeholder="Enter Name"></td><td><input type="text" class="form-control" id="memberEmailId'+i+'"	placeholder="Enter Email ID"></td><td><input type="text" class="form-control" id="contactNo'+i+'"	placeholder="Enter Contact No."></td><td><input type="checkbox"></td></tr>';    	
    	 $(rows).appendTo('#testing');
    	 
    	 
    	 
    }
   
  });*/


	

		
	
