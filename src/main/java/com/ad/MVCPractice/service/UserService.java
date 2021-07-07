package com.ad.MVCPractice.service;

import com.ad.MVCPractice.model.User;

import java.util.Set;

public interface UserService {
    // CREATE
    public Integer insert(User user);  // returns id

    // READ
    public User getById(Integer id);

    public User getByUsername(String username);

    public Set<User> getAll();

    // UPDATE
    public Boolean update(User user);  // returns false if user with given id does not exist already

    // DELETE
    public Boolean delete(User user);  // returns false if user with given id does not exist already
}
