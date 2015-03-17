package com.expensehead.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expensehead.dao.TransactionDao;
import com.expensehead.dao.UserDao;
import com.expensehead.form.AddContributionForm;
import com.expensehead.form.AddExpenseForm;
import com.expensehead.form.SettleDuesForm;
import com.expensehead.model.Journal;
import com.expensehead.model.Transactions;
import com.expensehead.model.User;
import com.expensehead.service.TransactionService;
import com.expensehead.utils.ExpenseUtility;

@Service
public class TransactionServiceImp implements TransactionService{

    @Autowired
    TransactionDao transactionDao;
    
    @Autowired
    UserDao userDao;
	
	@Override
	@Transactional
	public int addExpense(AddExpenseForm expenseForm, HttpServletRequest request) {
		int result ;
		Transactions transaction = populateTransaction(expenseForm, request);
		User user = userDao.getUser(String.valueOf(transaction.getUserId()));
		if("false".equalsIgnoreCase(expenseForm.getPool()))
			result = transactionDao.saveExpense(transaction,user);	
		else		
			result = transactionDao.savePoolExpense(transaction);

		
		
		return result;
	}

	@Override
	@Transactional
	public int addContribution(AddContributionForm contributionForm,HttpServletRequest request) {
		Journal journal = new Journal();
		int userId = ExpenseUtility.getUserIdFromSession(request);
		int groupId= ExpenseUtility.getGroupIdFromSession(request);
		User user = userDao.getUser(String.valueOf(userId));
		journal.setUserId(userId);
		journal.setGroupId(groupId);
		journal.setRecordDate(new Date());
		journal.setCredit(contributionForm.getContributionAmount());
		int result = transactionDao.saveContribution(journal,user);
		return result;
	}
	
	@Override
	@Transactional
	public int settleDues(SettleDuesForm settleDuesForm,HttpServletRequest request) {
		Journal journal = new Journal();
		int userId = ExpenseUtility.getUserIdFromSession(request);
		int groupId= ExpenseUtility.getGroupIdFromSession(request);
		User user = userDao.getUser(String.valueOf(userId));
		journal.setUserId(userId);
		journal.setGroupId(groupId);
		journal.setRecordDate(new Date());
		journal.setDebit(settleDuesForm.getContributionAmount());
		int result = transactionDao.settleDues(journal,user);
		return result;
	}
	
	@Override
	@Transactional
	public List<Transactions> getExpenseDetails() {
		List<Transactions> transactions = new ArrayList<Transactions>();
		transactions = transactionDao.getExpenseDetails();
		return transactions;
	}

	@Override
	@Transactional
	public List<Journal> getJournalDetails() {
		List<Journal> journal = new ArrayList<Journal>();
		journal = transactionDao.getJournalDetails();
		return journal;
	}

	
	public Transactions populateTransaction(AddExpenseForm expenseForm, HttpServletRequest request)
	{
		Transactions transaction = new  Transactions();
		int userId = ExpenseUtility.getUserIdFromSession(request);
		int groupId= ExpenseUtility.getGroupIdFromSession(request);
        transaction.setAmount(Integer.parseInt(expenseForm.getAmount()));
		transaction.setExpenseType(expenseForm.getExpenseType());
		transaction.setGroupId(groupId);
		transaction.setPoolFlag((expenseForm.getPool().equalsIgnoreCase("true")?true:false));
		transaction.setUserId(userId);
		transaction.setDiscription(expenseForm.getDescription());
		transaction.setEntryDate(new Date());
		return transaction;
	}

	
	
	

}
