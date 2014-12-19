package com.expensehead.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expensehead.dao.GroupDao;
import com.expensehead.form.RegisterForm;
import com.expensehead.form.UserForm;
import com.expensehead.model.Group;
import com.expensehead.model.User;
import com.expensehead.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupDao groupDao;

	
	@Override
	@Transactional
	public int createGroup(Group g) {
		groupDao.insertGroup(g);
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
	public Set<String> getUsersList(String groupName) {
		List<User> users = groupDao.fetchGroup(groupName);
		Set<String> userSet = new HashSet<String>(); 	
		for(User user : users){
			userSet.add(user.getUserName());
		}
		
		return userSet;
	}
	
	@Override
	@Transactional
	public Set<String> getUsers(String groupId) {
		Set<String> users=groupDao.fetchUsers(groupId);
		return users;
	}
	
	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
	}

	@Override
	@Transactional
	public int registration(RegisterForm registerForm) {
		List<User> users= new ArrayList<User>();
		Group group=new Group();
		User user=null;
		
        group.setAddress(registerForm.getAddress());
        group.setGroupName(registerForm.getGroupName());
		
		
		for(UserForm form:registerForm.getListOfMembers()){
           user=new User();
           
           String id=form.getUserName().substring(0,2)+form.getContactNo().substring(4, 9)+group.getGroupName();
        		   
           user.setUserId(id);
           user.setContactNo(form.getContactNo());
           user.setEmailId(form.getEmailId());
           user.setPassword(group.getGroupName());
           user.setUserName(form.getUserName());
           user.setUserType(form.getIsAdmin().charAt(0));
           user.setGroup(group);
           users.add(user);
		}
		
		group.setGroupId(users.size()+group.getGroupName());
		group.setNoOfMembers(users.size());
		group.setUsers(users);
		groupDao.RegisterGroup(group);
		
		return 0;
	}
	
}
