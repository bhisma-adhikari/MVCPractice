package com.ad.MVCPractice.service;

import com.ad.MVCPractice.dao.UserDao;
import com.ad.MVCPractice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Integer insert(User user) {
        return this.userDao.insert(user);
    }

    @Override
    public User getById(Integer id) {
        return this.userDao.getById(id);
    }

    @Override
    public User getByUsername(String username) {
        return this.userDao.getByUsername(username);
    }

    @Override
    public Set<User> getAll() {
        return this.userDao.getAll();
    }

    @Override
    public Boolean update(User user) {
        return this.userDao.update(user);
    }

    @Override
    public Boolean delete(User user) {
        return this.userDao.delete(user);
    }
}
