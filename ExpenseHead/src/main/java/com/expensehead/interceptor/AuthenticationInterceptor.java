package com.expensehead.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.util.StringUtils;

public class AuthenticationInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        
        String userId = String.valueOf(request.getSession().getAttribute("userId"));
        if (!StringUtils.isEmpty(userId) && !(userId.equals("null"))) {
            return true;
        }
        response.sendRedirect("/ExpenseHead/firstpage");
        return false;
    }

}