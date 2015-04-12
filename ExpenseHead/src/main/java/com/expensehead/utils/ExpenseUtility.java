package com.expensehead.utils;

import javax.servlet.http.HttpServletRequest;

public class ExpenseUtility {

    /**
     * @param request
     * @return userId from session
     */
    public static int getUserIdFromSession(HttpServletRequest request) {
        return (Integer) request.getSession().getAttribute("userId");
    }

    /**
     * @param request
     * @return groupId from session
     */
    public static int getGroupIdFromSession(HttpServletRequest request) {
        return (Integer) request.getSession().getAttribute("groupId");
    }

    /**
     * @param request
     * @return username from session
     */
    public static String getUserName(HttpServletRequest request) {
        return (String) request.getSession().getAttribute("username");
    }
}
