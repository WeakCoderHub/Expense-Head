package com.expensehead.controller.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expensehead.constants.ExpenseType;
import com.expensehead.form.AddContributionForm;
import com.expensehead.form.AddExpenseForm;
import com.expensehead.service.TransactionService;

public abstract class ExpenseController {

    @Autowired
    ExpenseType expenseType;
    @Autowired
    TransactionService transaction;

    @RequestMapping(value = { "/expensetypes" }, method = RequestMethod.GET)
    @ResponseBody
    public List<String> getExpenseType(Model model) {
        List<String> list = expenseType.getCommonExpenseType();
        return list;
    }

    @RequestMapping(value = { "/addExpense" }, method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> addExpense(@RequestBody final AddExpenseForm addExpenseForm, HttpServletRequest request) {

        Map<String, String> response = new HashMap<String, String>();
        int result = transaction.addExpense(addExpenseForm, request);
        if (result > 0) {
            response.put("success", "true");
        }

        return response;
    }

    @RequestMapping(value = { "/addContribution" }, method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> addContribution(@RequestBody final AddContributionForm addContributionForm, HttpServletRequest request) {

        Map<String, String> response = new HashMap<String, String>();
        int result = transaction.addContribution(addContributionForm, request);
        if (result > 0) {
            response.put("success", "true");
        }
        return response;
    }

}
