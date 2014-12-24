package com.expensehead.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expensehead.dao.UserDao;
import com.expensehead.form.LoginForm;
import com.expensehead.model.User;
import com.expensehead.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
   
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public int loginUser(LoginForm loginForm){
	    User user = userDao.isUser(loginForm.getUserName(),loginForm.getPassword());
		if(null == user){
			return 0 ;
		}else if(user.getUserType() == 't'){
			return 2 ;
		}else {
			return 1 ;
		}
	  
  }
}
