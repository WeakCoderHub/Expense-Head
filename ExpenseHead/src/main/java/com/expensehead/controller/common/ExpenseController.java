package com.expensehead.controller.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expensehead.form.AddContributionForm;
import com.expensehead.form.AddExpenseForm;
import com.expensehead.form.JournalData;
import com.expensehead.form.SearchCriteria;
import com.expensehead.form.SettleDuesForm;
import com.expensehead.form.TransactionData;
import com.expensehead.service.TransactionService;

@RequestMapping("/dashboard")
public abstract class ExpenseController {

    @Autowired
    TransactionService transaction;

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

    @RequestMapping(value = { "/settleDues" }, method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> settleDues(@RequestBody final SettleDuesForm settleDuesForm, HttpServletRequest request) {

        Map<String, String> response = new HashMap<String, String>();
        int result = transaction.settleDues(settleDuesForm, request);
        if (result > 0) {
            response.put("success", "true");
        }
        return response;
    }

    @RequestMapping(value = { "/getExpenseDetails" }, method = RequestMethod.GET)
    @ResponseBody
    public Map<String, TransactionData> getExpenseDetails(@RequestBody final SearchCriteria searchCriteria, HttpServletRequest request) {

        Map<String, TransactionData> response = new HashMap<String, TransactionData>();
        List<TransactionData> result = transaction.getExpenseDetails(searchCriteria, request);
        int i = 0;
        for (TransactionData transaction : result) {
            response.put(String.valueOf(++i), transaction);
        }
        return response;
    }

    @RequestMapping(value = { "/getJournalDetails" }, method = RequestMethod.GET)
    @ResponseBody
    public Map<String, JournalData> getJournalDetails(@RequestBody final SearchCriteria searchCriteria, HttpServletRequest request) {

        Map<String, JournalData> response = new HashMap<String, JournalData>();
        List<JournalData> result = transaction.getJournalDetails(searchCriteria, request);
        int i = 0;
        for (JournalData journal : result) {
            response.put(String.valueOf(++i), journal);
        }
        return response;
    }

}
