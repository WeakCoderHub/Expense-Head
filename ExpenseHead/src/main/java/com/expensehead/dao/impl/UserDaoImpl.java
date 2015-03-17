package com.expensehead.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.expensehead.dao.UserDao;
import com.expensehead.model.User;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User isUser(String userName, String password) {

        Session session = this.sessionFactory.getCurrentSession();
        Query q = session.createQuery("from User where userName='" + userName + "' and password = '" + password + "' ");
        @SuppressWarnings("unchecked")
        List<User> user = (List<User>) q.list();
        try {
            User currentUser = user.get(0);
            return currentUser;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public User getUser(String userId) {
        Session session = this.sessionFactory.getCurrentSession();
        User user;
        Query q = session.createQuery("from User where userId='" + userId + "'");
        user = (User) q.list().get(0);
        return user;
    }

}
