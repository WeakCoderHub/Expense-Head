package com.expensehead.dao;

import java.util.List;

import com.expensehead.model.Group;
import com.expensehead.model.User;

public interface GroupDao {
	public int insertGroup(Group g);
	public int deleteGroup(String groupId);
	public int updateGroup(String groupId);
	public int RegisterGroup(Group group);
	
	public List<User> fetchGroup(String groupId);
	public List<User> fetchUsers(String groupId);
	
	/**
	 * @param  groupId
	 * @return Remaining amount in group pool .
	 */
	public long getCurrentAmount(String groupId);
}
