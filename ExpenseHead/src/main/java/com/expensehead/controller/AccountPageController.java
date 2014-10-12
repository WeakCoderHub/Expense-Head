package com.expensehead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountPageController {

	@RequestMapping(value={"/welcome","/"},method=RequestMethod.GET)
	public String doLogin(Model model){
		return "login";
	}
}
