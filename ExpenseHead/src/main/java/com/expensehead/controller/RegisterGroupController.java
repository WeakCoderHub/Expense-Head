package com.expensehead.controller;

import java.util.HashMap;
import java.util.Map;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expensehead.form.RegisterForm;
import com.expensehead.service.GroupService;

@Controller
public class RegisterGroupController {

	@Autowired
	private GroupService groupService;

	@ResponseBody
	@RequestMapping(value = { "/createGroup" })
	public Map<String,String> createGroup(@RequestBody final RegisterForm registerForm, Model model) {
		groupService.registration(registerForm);
		Map<String,String> response = new HashMap<String,String>();
		response.put("forwardUrl", "dashBoard");
		return response;
	
	}
	
	@RequestMapping(value = { "/dashBoard" },method = RequestMethod.GET)
	public String viewDashBoard() {
		return "/dashboard/pages/dashboard";
	
	}
	
	
}
