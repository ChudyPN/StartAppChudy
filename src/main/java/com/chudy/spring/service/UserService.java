package com.chudy.spring.service;

import com.chudy.spring.model.User;

import java.util.List;

public interface UserService {
    public void addUser(User u);
    public  void updateUser(User u);
    public List<User> listUser();
    public  User getUserById(int id);
    public void removeUser(int id);
}
