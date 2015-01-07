package com.expensehead.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.expensehead.dao.TransactionDao;
import com.expensehead.model.Transactions;

@Repository
public class TransactionDaoImpl implements TransactionDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int saveExpense(Transactions transactions,int amount,int groupId,int userId) {
		Session session = this.sessionFactory.getCurrentSession();
		int result = (Integer) session.save(transactions);
		Query q = session.createQuery("update User set payback = payback + '"+amount+"' where userId = '"+userId+"'");
		result = q.executeUpdate();
		Query q1 = session.createQuery("update Group set payback = payback - '"+amount+"' where groupId = '"+groupId+"'");
		result = q1.executeUpdate();
		return result;
	}

	@Override
	public int savePoolExpense(Transactions transactions, int amount,int groupId) {
		amount = -amount;
		Session session = this.sessionFactory.getCurrentSession();
		int result = (Integer) session.save(transactions);
		Query q = session.createQuery("update Group set depositsLeft = depositsLeft + :amount where groupId = '"+groupId+"'");
		q.setParameter("amount",amount);
		result = q.executeUpdate();
		return result;
		
	}

}
