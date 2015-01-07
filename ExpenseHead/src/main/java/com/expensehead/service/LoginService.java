package com.expensehead.service;

import javax.servlet.http.HttpServletRequest;

import com.expensehead.form.LoginForm;

public interface LoginService {
  public int loginUser(LoginForm loginForm,HttpServletRequest request);
}
