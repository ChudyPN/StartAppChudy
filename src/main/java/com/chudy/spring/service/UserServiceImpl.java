package com.chudy.spring.service;


import com.chudy.spring.dao.UserDAO;
import com.chudy.spring.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    @Transactional
    public void addUser(User u) {
        userDAO.addUser(u);
    }

    @Override
    @Transactional
    public void updateUser(User u) {
        this.userDAO.updateUser(u);

    }

    @Override
    @Transactional
    public List<User> listUser() {
        return userDAO.listUser();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void removeUser(int id) {
        this.userDAO.removeUser(id);
    }
}
