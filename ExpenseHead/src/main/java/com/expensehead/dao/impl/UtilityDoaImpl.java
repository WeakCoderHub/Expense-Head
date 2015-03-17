package com.expensehead.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.expensehead.dao.UtilityDao;
import com.expensehead.model.StickyNote;

@Repository
public class UtilityDoaImpl implements UtilityDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int saveStickyNote(StickyNote model) {
        Session session = this.sessionFactory.getCurrentSession();
        int result = (Integer) session.save(model);

        return result;
    }

    @Override
    public ArrayList<String> allStickyNotes(int userId) {
        Session session = this.sessionFactory.getCurrentSession();

        Query q = session.createQuery("select date from StickyNote where userId = :userId");
        q.setParameter("userId", userId);
        List<String> dates = (List<String>) q.list();
        return (ArrayList<String>) dates;
    }

    @Override
    public ArrayList<String> getStickyNote(int userId, String date) {
        Session session = this.sessionFactory.getCurrentSession();

        Query q = session.createQuery("select message from StickyNote where userId = :userId and date = :date");
        q.setParameter("userId", userId);
        q.setParameter("date", date);
        List<String> dates = (List<String>) q.list();
        return (ArrayList<String>) dates;
    }

}
