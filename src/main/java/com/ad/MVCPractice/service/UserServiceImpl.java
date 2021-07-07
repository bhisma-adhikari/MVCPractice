package com.ad.MVCPractice.service;

import com.ad.MVCPractice.dao.UserDaoImpl;
import com.ad.MVCPractice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDaoImpl userDaoImpl;

    @Override
    public Integer insert(User user) {
        return this.userDaoImpl.insert(user);
    }

    @Override
    public User getById(Integer id) {
        return this.userDaoImpl.getById(id);
    }

    @Override
    public User getByUsername(String username) {
        return this.userDaoImpl.getByUsername(username);
    }

    @Override
    public Set<User> getAll() {
        return this.userDaoImpl.getAll();
    }

    @Override
    public Boolean update(User user) {
        return this.userDaoImpl.update(user);
    }

    @Override
    public Boolean delete(User user) {
        return this.userDaoImpl.delete(user);
    }
}
