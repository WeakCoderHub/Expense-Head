package com.expensehead.controller;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expensehead.form.LoginForm;
import com.expensehead.model.Group;
import com.expensehead.model.User;
import com.expensehead.service.GroupService;

@Controller
public class AccountPageController {

	@Autowired
	private GroupService groupService;
	
	@RequestMapping(value={"/welcome","/"},method=RequestMethod.GET)
	public String getHomePage(Model model){
		model.addAttribute("loginForm", new LoginForm());
		return "login1";
	}
	
	
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
/*		Group g = new Group();
		g.setGroupId("1");
		g.setGroupName("Banana");
		g.setNoOfMembers(2);
		User u1 = new User();
		User u2 = new User();
		List<User> user = new ArrayList<User>();
		u1.setUserId("anki");
		 u1.setUserName("ankit");
		u1.setEmailId("ankit010ankit@gmail.com");
		
		u2.setUserId("aru");
		u2.setUserName("arun");
		u2.setEmailId("arun@gmail.com");
		user.add(u1);
		user.add(u2);
		g.setUsers(user);
		groupService.createGroup(g);
*/		
		Set<String> users=groupService.getUsersList(groupName);
		System.out.println(users);
		return users;
	}
	
	@RequestMapping(value={"/login"},method=RequestMethod.POST)
	public String login(@Valid LoginForm loginForm,
            BindingResult bindingResult,Model model){
		
		if (bindingResult.hasErrors()) {
            return "addfine";
        }
		
		return "admin";
	}
	
}
