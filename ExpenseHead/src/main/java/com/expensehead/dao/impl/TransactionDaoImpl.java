package com.expensehead.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.expensehead.dao.TransactionDao;
import com.expensehead.model.Journal;
import com.expensehead.model.Transactions;

@Repository
public class TransactionDaoImpl implements TransactionDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int saveExpense(Transactions transaction, boolean isPayableOutstanding) {
		Session session = this.sessionFactory.getCurrentSession();
		int result = (Integer) session.save(transaction);
		
		int amount = transaction.getAmount();
		int userId = transaction.getUserId();
		int groupId =  transaction.getGroupId();
		if(isPayableOutstanding)
		{
			Query q3 = session.createQuery("update User set payable = payable - '"+amount+"' where userId = '"+userId+"'");
			q3.executeUpdate();
		}
		else
		{
			Query q1 = session.createQuery("update User set receivable = receivable + '"+amount+"' where userId = '"+userId+"'");
			q1.executeUpdate();
			Query q2 = session.createQuery("update Group set payback = payback + '"+amount+"' where groupId = '"+groupId+"'");
			q2.executeUpdate();
		}
	
		
		
		
		return result;
	}

	@Override
	public int savePoolExpense(Transactions transaction) {
		amount = -amount;
		Session session = this.sessionFactory.getCurrentSession();
		int result = (Integer) session.save(transactions);
		Query q = session.createQuery("update Group set depositsLeft = depositsLeft + :amount where groupId = '"+groupId+"'");
		q.setParameter("amount",amount);
		result = q.executeUpdate();
		return result;
		
	}

	@Override
	public int saveContribution(Journal journal) {
		Session session = this.sessionFactory.getCurrentSession();
		int result = (Integer) session.save(journal);
		return 0;
	}

}
