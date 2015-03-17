package com.expensehead.utils;

import javax.servlet.http.HttpServletRequest;

public class ExpenseUtility {
	
	public static int getUserIdFromSession(HttpServletRequest request)
	{
		return (Integer)request.getSession().getAttribute("userId");
	}
	
	public static int getGroupIdFromSession(HttpServletRequest request)
	{
		return (Integer)request.getSession().getAttribute("groupId");
	}

}
