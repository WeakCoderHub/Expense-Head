package com.expensehead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.expensehead.form.LoginForm;

@Controller
public class AccountPageController {

	@RequestMapping(value={"/welcome","/"},method=RequestMethod.GET)
	public String getHomePage(Model model){
		model.addAttribute("loginForm", new LoginForm());
		return "login1";
	}
	
	@RequestMapping(value={"/login"},method=RequestMethod.POST)
	public String login(Model model){
		return "admin";
	}
	
}
