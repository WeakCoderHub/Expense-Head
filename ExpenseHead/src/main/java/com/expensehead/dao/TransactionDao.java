package com.expensehead.dao;

import java.util.List;

import com.expensehead.model.Journal;
import com.expensehead.model.Transactions;
import com.expensehead.model.User;

public interface TransactionDao {
	public int saveExpense(Transactions transaction, User user);
	public int savePoolExpense(Transactions transaction);
	public int saveContribution(Journal journal,User user);
	public int settleDues(Journal journal, User user);
	public List<Transactions> getExpenseDetails(int groupId);
	public List<Journal> getJournalDetails(int groupId);
}
