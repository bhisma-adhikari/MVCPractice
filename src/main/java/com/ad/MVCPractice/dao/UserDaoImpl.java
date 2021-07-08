package com.ad.MVCPractice.dao;

import com.ad.MVCPractice.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Integer insert(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        Integer id  = null;
        try {
            id = (Integer) session.save(user);
        } catch (Exception e) {
            System.out.println("---------------------");
            System.out.println(e.toString());
            System.out.println("=====================");
            e.printStackTrace();
            System.out.println("---------------------");
        }
        System.out.println("returning id from UserDao");
        return id;
    }

    @Override
    public User getById(Integer id) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public Set<User> getAll() {
        return null;
    }

    @Override
    public Boolean update(User user) {
        return null;
    }

    @Override
    public Boolean delete(User user) {
        return null;
    }
}
