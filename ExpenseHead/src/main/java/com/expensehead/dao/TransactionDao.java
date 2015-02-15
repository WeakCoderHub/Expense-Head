package com.expensehead.dao;

import com.expensehead.model.Journal;
import com.expensehead.model.Transactions;

public interface TransactionDao {

	public int saveExpense(Transactions transaction, boolean isPayableOutstanding);
	public int savePoolExpense(Transactions transaction);
	public int saveContribution(Journal journal);
}
