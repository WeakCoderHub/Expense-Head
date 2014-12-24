 $(document).ready(function(){
	 $("#addExpenseId").click(function(){
        $("#addExpensePopup").show();
	 });
	 
	 
	 
	 jQuery(".popupopen").click(function() {
		  box = jQuery(this).attr('rel');
		  jQuery('#'+box).show();
		  
		  width = -1 * parseInt((jQuery('#'+box).width()/2));
		  height = -1 * parseInt((jQuery('#'+box).height()/2));
		  jQuery('#'+box).css('margin-left',width).css('margin-top',height);
		  return false;
		});
	 
		jQuery(".popupclose").click(function() {
		  jQuery(this).parent().hide();
		  return false;
		});
		
		var popupStatus = 0;
		
		function loadPopup()
		{

			if(popupStatus==0)
			{
				$("#popupBackground").css(
				{
					"opacity": "0.3"
				});
				$("#popupBackground").fadeIn("slow");
				$("#popupForm").fadeIn("slow");
				popupStatus = 1;
			}
			
		}
		
		function disablePopup()
		{
			if(popupStatus == 1)
			{
				$("#popupBackground").fadeOut("slow");
				$("#popupForm").fadeOut("slow");
				popupStatus = 0;
			}
		}
		
		function centrePopup()
		{
			var windowWidth = document.documentElement.clientWidth;
			var windowHeight = document.documentElement.clientHeight;
			
			var popupHeight = $("#popupForm").height();
			var popupWidth = $("#popupForm").width();

			$("#popupForm").css(
			{
				"position": "absolute",
				"top": windowHeight/2-popupHeight/2,
				"left": windowWidth/2-popupWidth/2
			});
			
			$("#popupBackground").css({
				"height": windowHeight
			});
		}
		
		$(".popupClick").click(function()
		{
//			$("#popupForm").append("Got it");
			centrePopup();
			loadPopup();
		});
		
		$("#closePopup").click(function()
		{
			disablePopup();
		});
		
		$("#popupBackground").click(function()
		{
			disablePopup();
		});
		
		$(document).keypress(function(e)
		{
			if(e.keyCode==27 && popupStatus==1)
			{
				disablePopup();
			}
		});


		
 });