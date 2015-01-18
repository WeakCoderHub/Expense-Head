package com.expensehead.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginForm {
	
	@Size(min=2, max=15)
	@NotEmpty
	private String groupId;
	
	
	private String userName;
	
	@Size(min=2, max=15)
	@NotEmpty
	private String password;
	
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
  
	
	
}