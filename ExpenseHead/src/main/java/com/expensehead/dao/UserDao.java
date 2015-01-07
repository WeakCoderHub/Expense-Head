package com.expensehead.dao;

import com.expensehead.model.User;

public interface UserDao {
   public User isUser(String username,String password);
   public User getUser(String userId);
}
