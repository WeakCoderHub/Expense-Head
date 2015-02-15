package com.expensehead.service;

import javax.servlet.http.HttpServletRequest;

import com.expensehead.form.AddContributionForm;
import com.expensehead.form.AddExpenseForm;

public interface TransactionService {

	public int addExpense(AddExpenseForm expenseForm,HttpServletRequest request);
	public int addContribution(AddContributionForm contributionForm, HttpServletRequest request);
	
}
