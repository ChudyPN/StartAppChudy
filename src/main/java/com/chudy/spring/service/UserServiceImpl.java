package com.chudy.spring.service;


import com.chudy.spring.dao.UserDAO;
import com.chudy.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void addUser(User u) {
        this.userDAO = userDAO;

    }

    @Override
    @Transactional
    public void updateUser(User u) {
        this.userDAO.updateUser(u);

    }

    @Override
    @Transactional
    public List<User> listUser() {
        return this.userDAO.listUser();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return this.userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void removePhone(int id) {
        this.userDAO.removeUser(id);
    }
}
