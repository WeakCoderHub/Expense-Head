package com.expensehead.service;

import com.expensehead.model.Group;

public interface GroupService {
	int createGroup(Group g);
	int removeGroup(String groupId);
	int editGroup(String groupId);
	Group getGroupDetails(String groupId);
	
}
