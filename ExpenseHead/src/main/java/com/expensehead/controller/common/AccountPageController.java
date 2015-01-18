package com.expensehead.controller.common;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expensehead.service.GroupService;
import com.expensehead.service.LoginService;


public abstract class AccountPageController {

	@Autowired
	private GroupService groupService;
	
	@Autowired
	protected LoginService loginService;
	
	@ResponseBody
	@RequestMapping(value={"/getUsers"},method=RequestMethod.GET, produces="application/json")
	public Set<String> getUsers(@RequestParam("groupName") String groupName){
		Set<String> users = new HashSet<String>();
		users = groupService.getUsers(groupName);
		return users;
	}
	
	@ResponseBody
	@RequestMapping(value={"/getUserList"},method=RequestMethod.GET, produces="application/json")
	public Set<String> getUserList(@RequestParam("groupName") String groupName){
		Set<String> users=groupService.getUsersList(groupName);
		return users;
	}
	

	
}
