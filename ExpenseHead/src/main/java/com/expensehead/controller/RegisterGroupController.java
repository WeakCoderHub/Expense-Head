package com.expensehead.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.support.RegistrationPolicy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.expensehead.form.LoginForm;
import com.expensehead.form.RegisterForm;
import com.expensehead.form.RegisterationForm;
import com.expensehead.service.GroupService;

@Controller
public class RegisterGroupController {

	@Autowired
	private GroupService groupService;

	@RequestMapping(value={"/registeUser"},method=RequestMethod.GET, produces="application/json")
	public String registration(Model model){
		List<RegisterationForm> usersList = new ArrayList<RegisterationForm>();
		RegisterationForm registerationForm=new RegisterationForm();
		
		registerationForm.setGroupName("banana");
		registerationForm.setUserName("arun");
		registerationForm.setAddress("house no 747");
		registerationForm.setPhoneNumber("8588899072");
		registerationForm.setUserType('A');
		registerationForm.setEmail("07oct90@gmail.com");
		
		usersList.add(registerationForm);
		
RegisterationForm registerationForm1=new RegisterationForm();
		
		registerationForm1.setGroupName("banana");
		registerationForm1.setUserName("ankit");
		registerationForm1.setAddress("house no 747");
		registerationForm1.setPhoneNumber("8588811111");
		registerationForm1.setEmail("ankit.gupta@gmail.com");
		
		usersList.add(registerationForm1);
		
		groupService.registration(usersList);
		
		model.addAttribute("loginForm", new LoginForm());
		return "login";
	}
	
	@RequestMapping(value={"/createGroup"},method=RequestMethod.POST)
	public String createGroup(@RequestBody final RegisterForm registerForm)
	{
		return "success";
	}
}
