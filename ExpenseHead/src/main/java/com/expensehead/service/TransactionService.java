package com.expensehead.service;

import javax.servlet.http.HttpServletRequest;

import com.expensehead.form.AddExpenseForm;

public interface TransactionService {

	public int addExpense(AddExpenseForm expenseForm,HttpServletRequest request);
	
}
