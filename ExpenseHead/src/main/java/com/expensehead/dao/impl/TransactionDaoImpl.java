package com.expensehead.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.expensehead.dao.TransactionDao;
import com.expensehead.model.Journal;
import com.expensehead.model.Transactions;
import com.expensehead.model.User;

@Repository
public class TransactionDaoImpl implements TransactionDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int saveExpense(Transactions transaction, User user) {
        Session session = this.sessionFactory.getCurrentSession();
        int userPayable = user.getPayable();
        int expense = transaction.getAmount();
        int userId = transaction.getUserId();
        int groupId = transaction.getGroupId();
        int amountDifference = expense - userPayable;
        int result = (Integer) session.save(transaction);

        if (expense > userPayable) {
            Query q1 = session.createQuery("update User set payable = payable - '" + userPayable + "',receivable = receivable +'"
                    + amountDifference + "' where userId = '" + userId + "'");
            q1.executeUpdate();
            Query q2 = session.createQuery("update Group set payback = payback + '" + amountDifference + "' where groupId = '" + groupId
                    + "'");
            q2.executeUpdate();
        } else {
            Query q1 = session.createQuery("update User set payable = payable - '" + expense + "' where userId = '" + userId + "'");
            q1.executeUpdate();
        }
        return result;
    }

    @Override
    public int savePoolExpense(Transactions transactions) {
        Session session = this.sessionFactory.getCurrentSession();
        int result = (Integer) session.save(transactions);
        Query q = session.createQuery("update Group set depositsLeft = depositsLeft - :amount where groupId = :groupId");
        q.setParameter("amount", transactions.getAmount());
        q.setParameter("groupId", transactions.getGroupId());
        result = q.executeUpdate();
        return result;

    }

    @Override
    public int saveContribution(Journal journal, User user) {
        Session session = this.sessionFactory.getCurrentSession();
        int result = (Integer) session.save(journal);
        int creditAmount = journal.getCredit();
        int userPayable = user.getPayable();
        int amountDifference = creditAmount - userPayable;
        if (creditAmount <= userPayable) {
            Query q1 = session.createQuery("update Group set depositsLeft = depositsLeft + :amount where groupId = :groupId");
            q1.setParameter("amount", creditAmount);
            q1.setParameter("groupId", journal.getGroupId());
            result = q1.executeUpdate();

            Query q2 = session.createQuery("update User set payable = payable - :amount where userId = :userId");
            q2.setParameter("amount", creditAmount);
            q2.setParameter("userId", journal.getUserId());
            result = q2.executeUpdate();
        } else {
            Query q1 = session
                    .createQuery("update Group set depositsLeft = depositsLeft + :creditAmount, payback = payback + :amountDifference where groupId = :groupId");
            q1.setParameter("creditAmount", creditAmount);
            q1.setParameter("amountDifference", amountDifference);
            q1.setParameter("groupId", journal.getGroupId());
            result = q1.executeUpdate();

            Query q2 = session
                    .createQuery("update User set payable = payable - :payable, receivable = receivable + :amountDifference where userId = :userId");
            q2.setParameter("payable", userPayable);
            q2.setParameter("amountDifference", amountDifference);
            q2.setParameter("userId", journal.getUserId());
            result = q2.executeUpdate();
        }
        return result;
    }

    @Override
    public int settleDues(Journal journal, User user) {
        Session session = this.sessionFactory.getCurrentSession();
        int result = (Integer) session.save(journal);
        int debitAmount = journal.getDebit();
        int userReceivable = user.getReceivable();
        int amountDifference = debitAmount - userReceivable;
        if (debitAmount <= userReceivable) {
            Query q1 = session
                    .createQuery("update Group set depositsLeft = depositsLeft - :amount, payback = payback - :amount where groupId = :groupId");
            q1.setParameter("amount", debitAmount);
            q1.setParameter("groupId", journal.getGroupId());
            result = q1.executeUpdate();

            Query q2 = session.createQuery("update User set receivable = receivable - :amount where userId = :userId");
            q2.setParameter("amount", debitAmount);
            q2.setParameter("userId", journal.getUserId());
            result = q2.executeUpdate();
        } else {
            Query q1 = session
                    .createQuery("update Group set depositsLeft = depositsLeft - :debitAmount, payback = payback - :receivable where groupId = :groupId");
            q1.setParameter("debitAmount", debitAmount);
            q1.setParameter("receivable", userReceivable);
            q1.setParameter("amountDifference", amountDifference);
            q1.setParameter("groupId", journal.getGroupId());
            result = q1.executeUpdate();

            Query q2 = session
                    .createQuery("update User set payable = payable + :amountDifference, receivable = receivable - :receivable where userId = :userId");
            q2.setParameter("receivable", userReceivable);
            q2.setParameter("amountDifference", amountDifference);
            q2.setParameter("userId", journal.getUserId());
            result = q2.executeUpdate();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Transactions> getExpenseDetails(int groupId) {
        Session session = this.sessionFactory.getCurrentSession();
        List<Transactions> transactions = new ArrayList<Transactions>();
        Query q = session.createQuery("from Transactions where groupId = :groupId");
        q.setParameter("groupId", groupId);
        transactions = (List<Transactions>) q.list();
        return transactions;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Journal> getJournalDetails(int groupId) {
        Session session = this.sessionFactory.getCurrentSession();
        List<Journal> journal = new ArrayList<Journal>();
        Query q = session.createQuery("from Journal where groupId = :groupId");
        q.setParameter("groupId", groupId);
        journal = (List<Journal>) q.list();
        return journal;
    }

}
