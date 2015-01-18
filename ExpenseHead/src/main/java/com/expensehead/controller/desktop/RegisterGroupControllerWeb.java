package com.expensehead.controller.desktop;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.expensehead.controller.common.RegisterGroupController;

@Controller
public class RegisterGroupControllerWeb extends RegisterGroupController {

	@RequestMapping(value = { "/dashBoard" }, method = RequestMethod.GET)
	public String viewDashBoard(Model model, HttpServletRequest request) {

		model.addAttribute(
				"currentAmount",
				groupService.getRemainingAmount(request.getSession()
						.getAttribute("groupId").toString()));
		return "/dashboard/pages/dashboard";

	}
}
