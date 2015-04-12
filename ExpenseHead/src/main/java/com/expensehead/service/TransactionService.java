package com.expensehead.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.expensehead.form.AddContributionForm;
import com.expensehead.form.AddExpenseForm;
import com.expensehead.form.SearchCriteria;
import com.expensehead.form.SettleDuesForm;
import com.expensehead.model.Journal;
import com.expensehead.model.Transactions;

public interface TransactionService {

	public int addExpense(AddExpenseForm expenseForm,HttpServletRequest request);
	public int addContribution(AddContributionForm contributionForm, HttpServletRequest request);
	public int settleDues(SettleDuesForm settleDuesForm,HttpServletRequest request);
	public List<Transactions> getExpenseDetails(SearchCriteria searchCriteria, HttpServletRequest request);
	public List<Journal> getJournalDetails(SearchCriteria searchCriteria,HttpServletRequest request);
	
}
