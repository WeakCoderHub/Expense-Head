package com.expensehead.controller.mobile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expensehead.controller.common.AccountPageController;
import com.expensehead.form.GenericResponse;
import com.expensehead.form.LoginForm;

@Controller
@RequestMapping(value = "/m")
public class AccountPageControllerMobile extends AccountPageController {

    @RequestMapping(value = { "/login" }, method = RequestMethod.POST)
    @ResponseBody
    public GenericResponse login(@Valid LoginForm loginForm, HttpServletRequest request) {

        GenericResponse response = new GenericResponse();
        int result = loginService.loginUser(loginForm, request);
        if (result == 0) {
            response.setStatus(false);
        } else if (result == 1) {
            request.getSession().setAttribute("username", loginForm.getUserName());
            response.setStatus(true);
        } else {
            response.setStatus(true);
        }

        return response;
    }
}
