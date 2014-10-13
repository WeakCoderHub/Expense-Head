package com.expensehead.dao;

import com.expensehead.model.Group;

public interface GroupDao {
	int insertGroup(Group g);
	int deleteGroup(String groupId);
	int updateGroup(String groupId);
	Group fetchGroup(String groupId);
	
}
