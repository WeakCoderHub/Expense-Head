package com.expensehead.controller.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expensehead.form.RegisterForm;
import com.expensehead.service.GroupService;


public abstract class RegisterGroupController {

	@Autowired
	protected GroupService groupService;

	@ResponseBody
	@RequestMapping(value = { "/createGroup" })
	public Map<String, String> createGroup(
			@RequestBody final RegisterForm registerForm, Model model,
			HttpServletRequest request) {
		int groupId = groupService.registration(registerForm);
		Map<String, String> response = new HashMap<String, String>();
		response.put("forwardUrl", "dashBoard");
		request.getSession().setAttribute("groupname",
				registerForm.getGroupName());
		request.getSession().setAttribute("groupId", groupId);
		return response;

	}


}
