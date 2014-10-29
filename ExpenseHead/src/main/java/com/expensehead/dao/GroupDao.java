package com.expensehead.dao;

import java.util.List;
import java.util.Set;

import com.expensehead.model.Group;
import com.expensehead.model.User;

public interface GroupDao {
	int insertGroup(Group g);
	int deleteGroup(String groupId);
	int updateGroup(String groupId);
	List<User> fetchGroup(String groupId);
	Set<String> fetchUsers(String groupId);
	
}
