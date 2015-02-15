package com.expensehead.service.impl;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expensehead.dao.TransactionDao;
import com.expensehead.dao.UserDao;
import com.expensehead.form.AddContributionForm;
import com.expensehead.form.AddExpenseForm;
import com.expensehead.model.Journal;
import com.expensehead.model.Transactions;
import com.expensehead.model.User;
import com.expensehead.service.TransactionService;

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
		{
			if(user.getPayable()>=transaction.getAmount())
			{
				result = transactionDao.saveExpense(transaction,true);
			}
			else
			{
				result = transactionDao.saveExpense(transaction,false);
			}
		}
		else
		{		
			result = transactionDao.savePoolExpense(transaction);
		}
		
		
		return result;
	}

	@Override
	public int addContribution(AddContributionForm contributionForm,HttpServletRequest request) {
		Journal journal = new Journal();
		int userId = (Integer)request.getSession().getAttribute("userId");
		journal.setUserId(userId);
		journal.setRecordDate(new Date());
		journal.setDebit(contributionForm.getContributionAmount());
		return 1;
	}
	
	public Transactions populateTransaction(AddExpenseForm expenseForm, HttpServletRequest request)
	{
		Transactions transaction = new  Transactions();
        int groupId= (Integer)request.getSession().getAttribute("groupId");
        int userId = (Integer)request.getSession().getAttribute("userId");
        int amount = Integer.parseInt(expenseForm.getAmount());
        
        transaction.setAmount(amount);
		transaction.setExpenseType(expenseForm.getExpenseType());
		transaction.setGroupId(groupId);
		transaction.setPoolFlag((expenseForm.getPool().equalsIgnoreCase("true")?true:false));
		transaction.setUserId(userId);
		transaction.setDiscription(expenseForm.getDescription());
		transaction.setEntryDate(new Date());
		return transaction;
	}

}
