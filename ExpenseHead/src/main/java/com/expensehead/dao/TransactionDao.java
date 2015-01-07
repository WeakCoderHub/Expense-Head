package com.expensehead.dao;

import com.expensehead.model.Transactions;

public interface TransactionDao {

	public int saveExpense(Transactions transactions,int amount,int grroupId,int userId);
	public int savePoolExpense(Transactions transactions,int amount,int groupId);
}
