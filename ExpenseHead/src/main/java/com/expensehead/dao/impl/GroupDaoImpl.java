package com.expensehead.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.expensehead.dao.GroupDao;
import com.expensehead.model.Group;

@Repository
public class GroupDaoImpl implements GroupDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int deleteGroup(String groupId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateGroup(String groupId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Group fetchGroup(String groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertGroup(Group g) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
