package com.expensehead.controller.desktop;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.expensehead.controller.common.AccountPageController;
import com.expensehead.form.LoginForm;

@Controller
public class AccountPageControllerWeb extends AccountPageController {

	@RequestMapping(value = { "/welcome", "/" }, method = RequestMethod.GET)
	public String getHomePage(Model model) {
		model.addAttribute("loginForm", new LoginForm());
		return "login";
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String login(@Valid LoginForm loginForm,
			BindingResult bindingResult, Model model,
			final RedirectAttributes redirectModel, HttpServletRequest request) {

		int result = loginService.loginUser(loginForm, request);
		if (result == 0) {

			return "redirect:/welcome";
		} else if (result == 1) {
			request.getSession().setAttribute("username",
					loginForm.getUserName());

			return "redirect:/dashBoard";
		} else {
			return "redirect:/dashBoard";
		}
	}
}
