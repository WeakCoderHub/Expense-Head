package com.expensehead.service;

import java.util.Set;

import com.expensehead.form.RegisterForm;
import com.expensehead.model.Group;

public interface GroupService {
	int createGroup(Group g);
	int removeGroup(String groupId);
	int editGroup(String groupId);
	Set<String> getUsers(String groupId);
	Set<String> getUsersList(String groupName);
	
	int registration(RegisterForm form);
	
}
