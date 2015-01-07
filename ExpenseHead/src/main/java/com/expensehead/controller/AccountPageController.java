package com.expensehead.controller;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.expensehead.form.LoginForm;
import com.expensehead.service.GroupService;
import com.expensehead.service.LoginService;

@Controller
public class AccountPageController {

	@Autowired
	private GroupService groupService;
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value={"/welcome","/"},method=RequestMethod.GET)
	public String getHomePage(Model model){
		model.addAttribute("loginForm", new LoginForm());
		return "login";
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
		/*Group g = new Group();
		g.setGroupId("100");
		g.setGroupName("gurgaon");
		g.setNoOfMembers(2);
		User u1 = new User();
		User u2 = new User();
		List<User> user = new ArrayList<User>();
		u1.setUserId("200");
		 u1.setUserName("ankit");
		u1.setEmailId("ankit010ankit@gmail.com");
		
		u2.setUserId("201");
		u2.setUserName("arun");
		u2.setEmailId("arun@gmail.com");
		user.add(u1);
		user.add(u2);
		g.setUsers(user);
		groupService.createGroup(g);*/
		
		Set<String> users=groupService.getUsersList(groupName);
		return users;
	}
	
	@RequestMapping(value={"/login"},method=RequestMethod.POST)
	public String login(@Valid LoginForm loginForm,
            BindingResult bindingResult,Model model,final RedirectAttributes redirectModel,HttpServletRequest request){
		
		int result = loginService.loginUser(loginForm,request);
		if(result == 0){
			
			return "redirect:/welcome";
		}else if(result == 1){
		   request.getSession().setAttribute("username",loginForm.getUserName());	
		   
		return "redirect:/dashBoard";}
		else{
			return "redirect:/dashBoard";
		}
	}
	
}
