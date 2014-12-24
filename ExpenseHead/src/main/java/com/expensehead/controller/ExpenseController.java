package com.expensehead.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expensehead.constants.ExpenseType;

@Controller
public class ExpenseController {

	@Autowired
	ExpenseType expenseType;
	
	@RequestMapping(value={"/expensetypes"},method=RequestMethod.GET)
	@ResponseBody
	public List<String> getExpenseType(Model model){
		 List<String> list = expenseType.getCommonExpenseType();
		 return list;
	}
	
}
