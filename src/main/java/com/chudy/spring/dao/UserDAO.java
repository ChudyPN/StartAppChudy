package com.chudy.spring.dao;

import com.chudy.spring.model.User;

import java.util.List;

public interface UserDAO {

    public void addUser(User u);
    public void updateUser(User u);
    public List<User> listUser();
    public User getUserById(int id);
    public void removeUser(int id);
}
