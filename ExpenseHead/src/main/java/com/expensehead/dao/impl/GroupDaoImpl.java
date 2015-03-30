package com.expensehead.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.expensehead.dao.GroupDao;
import com.expensehead.model.Group;
import com.expensehead.model.User;

@Repository
public class GroupDaoImpl implements GroupDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int deleteGroup(String groupId) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateGroup(String groupId) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> fetchGroup(String groupName) {
        Session session = this.sessionFactory.getCurrentSession();
        Query q = session.createQuery("from Group where groupName='" + groupName + "'");
        List<Group> group = (List<Group>) q.list();
        List<User> users = null;
        try {
            Group g = group.get(0);
            users = g.getUsers();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return users;

    }

    @Override
    public int insertGroup(Group g) {
        Session session = this.sessionFactory.getCurrentSession();
        try {
            session.save(g);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Group getGroup(String groupId) {
        Session session = this.sessionFactory.getCurrentSession();
        Query q = session.createQuery("from Group where groupId='" + groupId + "'");
        @SuppressWarnings("unchecked")
        List<Group> group = (List<Group>) q.list();
        Group g = group.get(0);
        return g;
    }

    @Override
    public int RegisterGroup(Group group) {

        Session session = this.sessionFactory.getCurrentSession();
        session.save(group);
        return 0;
    }

    @Override
    public long getCurrentAmount(String groupId) {
        Session session = this.sessionFactory.getCurrentSession();
        Query q = session.createQuery("select depositsLeft from Group where groupId = '" + groupId + "'");
        int result = (int) q.list().get(0);
        return result;
    }

}
