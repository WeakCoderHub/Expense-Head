package com.expensehead.service;

import java.util.Set;

import com.expensehead.form.RegisterForm;
import com.expensehead.model.Group;

public interface GroupService {
	public int createGroup(Group g);
	public int removeGroup(String groupId);
	public int editGroup(String groupId);
	public Set<String> getUsers(String groupId);
	public Set<String> getUsersList(String groupName);
	
	public int registration(RegisterForm form);
	public long getRemainingAmount(String groupId);
}
