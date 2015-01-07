package com.expensehead.service.impl;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expensehead.dao.TransactionDao;
import com.expensehead.form.AddExpenseForm;
import com.expensehead.model.Transactions;
import com.expensehead.service.TransactionService;

@Service
public class TransactionServiceImp implements TransactionService{

    @Autowired
    TransactionDao transactionDao;
	
	@Override
	@Transactional
	public int addExpense(AddExpenseForm expenseForm, HttpServletRequest request) {
        Transactions transaction = new  Transactions();
        int result ;
        int groupId= (Integer)request.getSession().getAttribute("groupId");
        int userId = (Integer)request.getSession().getAttribute("userId");
        int amount = Integer.parseInt(expenseForm.getAmount());
        
        transaction.setAmount(amount);
		transaction.setExpenseType(expenseForm.getExpenseType());
		transaction.setGroupId(groupId);
		transaction.setPoolFlag((expenseForm.getPool().equalsIgnoreCase("true")?true:false));
		transaction.setUserId((Integer)request.getSession().getAttribute("userId"));
		transaction.setDiscription(expenseForm.getDescription());
		transaction.setEntryDate(new Date());
		if(expenseForm.getPool().equalsIgnoreCase("true")){
			result = transactionDao.savePoolExpense(transaction,amount ,groupId);
		}else{
			result = transactionDao.saveExpense(transaction,amount,groupId,userId);
		}
		
		
		return result;
	}

}
