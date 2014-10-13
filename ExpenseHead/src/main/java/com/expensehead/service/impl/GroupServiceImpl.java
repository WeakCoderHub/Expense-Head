package com.expensehead.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expensehead.dao.GroupDao;
import com.expensehead.model.Group;
import com.expensehead.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupDao groupDao;

	
	@Override
	@Transactional
	public int createGroup(Group g) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public int removeGroup(String groupId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public int editGroup(String groupId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public Group getGroupDetails(String groupId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
	}
	
}
