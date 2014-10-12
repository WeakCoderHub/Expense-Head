  $(document).ready(function(){
	  
$("#pendingRequestTitle").click(function()
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

$("#addMember").click(function(){
	var i=($('#memberDetailBody').children().length)+1;
		var rows ='<tr><td class="white-Large-Label">'+i+'.</td><td><input type="text" class="form-control" id="memberName'+i+'" placeholder="Enter Name"></td><td><input type="text" class="form-control" id="memberEmailId'+i+'"	placeholder="Enter Email ID"></td><td><input type="text" class="form-control" id="contactNo'+i+'"	placeholder="Enter Contact No."></td><td style="padding-top: 1.1em; padding-left: 0.8em"><input type="radio" name="isAdmin" style="transform: scale(2);"></td> <td><button type="button" onclick="deleteRow(this)" class="btn btn-danger btn-sm deleteMember"><span class="glyphicon glyphicon-minus"></span></button></td></tr>';    		  
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




  });

  function deleteRow(row){
		 
		$(row).parent().parent().remove();
		
		  
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


	

		
	
