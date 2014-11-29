package com.expensehead.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.expensehead.form.RegisterationForm;
import com.expensehead.model.Group;
import com.expensehead.model.User;

public interface GroupService {
	int createGroup(Group g);
	int removeGroup(String groupId);
	int editGroup(String groupId);
	Set<String> getUsers(String groupId);
	Set<String> getUsersList(String groupName);
	
	int registration(List<RegisterationForm> list);
	
}
