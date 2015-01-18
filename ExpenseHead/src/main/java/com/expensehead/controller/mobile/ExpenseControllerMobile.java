package com.expensehead.controller.mobile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.expensehead.controller.common.ExpenseController;

@Controller
@RequestMapping(value = "/m")
public class ExpenseControllerMobile extends ExpenseController {

}
