package com.expensehead.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.expensehead.dao.GroupDao;
import com.expensehead.model.Group;
import com.expensehead.model.Test;
import com.expensehead.model.User;

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
	@SuppressWarnings("unchecked")
	public List<User> fetchGroup(String groupName) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Group where groupName='"+groupName+"'");
		List<Group> group =(List<Group>) q.list() ;
		Group g = group.get(0);
	System.out.println(g.getGroupId());	
	System.out.println(g.getUsers());
		
	List<User> users =  g.getUsers(); 
		for(User user:users){
			System.out.println(user.getUserName());
		}
	    return users;			
      
	}

	@Override
	public int insertGroup(Group g) {
		Session session = this.sessionFactory.getCurrentSession();
		try{
//		Test test=new Test();
//		test.setId("b");
//		session.save(test);
		
     	session.save(g);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return 0;
	}
	

	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Set<String> fetchUsers(String groupId) {
		Set<String> users = new HashSet<String>();
		System.out.println("dummy user list");
		users.add("Ankit");
		users.add("Arun");
		users.add("Jitu");
		users.add("Rohit");
		return users;
	}
	
}
