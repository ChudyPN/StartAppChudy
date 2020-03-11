package com.chudy.spring.dao;


import com.chudy.spring.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDAOImpl implements UserDAO {


    private static final Logger logger = LoggerFactory.getLogger(UserDAO.class);


    @Override
    public void addUser(User u) {

    }

    @Override
    public void updateUser(User u) {

    }

    @Override
    public List<User> listUser() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public void removeUser(int id) {

    }
}

