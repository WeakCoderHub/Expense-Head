package com.expensehead.controller.desktop;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.expensehead.controller.common.AccountPageController;
import com.expensehead.form.LoginForm;
import com.expensehead.service.UtilityServices;

@Controller
public class AccountPageControllerWeb extends AccountPageController {

    private final String DASHBOAD_PAGE = "redirect:dashBoard";
    private final String LOGIN_PAGE = "login";
    @Autowired
    private UtilityServices utilityServices;

    @RequestMapping(value = { "/", "firstpage" }, method = RequestMethod.GET)
    public String getHomePage(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return LOGIN_PAGE;
    }

    @RequestMapping(value = { "/login" }, method = RequestMethod.POST)
    public String login(@Valid LoginForm loginForm, BindingResult bindingResult, Model model, final RedirectAttributes redirectModel,
            HttpServletRequest request) throws ParseException {
        String redirect = null;
        ArrayList<String> dates = null;
        int result = loginService.loginUser(loginForm, request);
        if (result == 0) {
            model.addAttribute("loginForm", new LoginForm());
            redirect = LOGIN_PAGE;

        } else if (result == 1) {
            request.getSession().setAttribute("username", loginForm.getUserName());
            dates = utilityServices.getAllStickyNoteDates(String.valueOf(request.getSession().getAttribute("userId")));
            redirect = DASHBOAD_PAGE;
        } else {
            request.getSession().setAttribute("username", loginForm.getUserName());
            dates = utilityServices.getAllStickyNoteDates(String.valueOf(request.getSession().getAttribute("userId")));
            redirect = DASHBOAD_PAGE;
        }
        List<String> eventDates = new ArrayList<String>();
        if (null != dates) {
            for (String eventDate : dates) {
                eventDates.add(eventDate.toString());
            }
        }
        model.addAttribute("eventDates", eventDates);
        return redirect;
    }
}
