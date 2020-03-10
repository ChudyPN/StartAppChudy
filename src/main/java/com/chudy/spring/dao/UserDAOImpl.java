package com.chudy.spring.dao;

import com.chudy.spring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {


    private static final Logger logger = LoggerFactory.getLogger(UserDAO.class);

    private EntityManager manager;

    public UserDAOImpl(EntityManager manager) {
        this.manager = manager;
    }


}



    /*public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUser(User u) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(u);
        logger.info("User saved successfully, User Details=" + u);

    }
    @Override
    public void updateUser(User u) {
        Session session = this.sessionFactory.getCurrentSession();
        logger.info("User updated successfully, User Details=" + u);
    }

    @Override
    public List<User> listUser() {
        Session session = this.sessionFactory.getCurrentSession();

        List<User> userList = session.createQuery("from User").list();
            for (User u : userList) {
                logger.info("User list::" + u);
            }
            return userList;
    }
    @Override
    public User getUserById(int id) {
        Session session = this.sessionFactory.getCurrentSession();

        User u = (User) session.load(User.class, new Integer(id));
        logger.info("User loaded successfully, User details=" + u);
        return u;
    }
    @Override
    public void removeUser(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User u = (User) session.load(User.class, new Integer(id));

        if (null != u) {
            session.delete(u);
        }
        logger.info("User deleted successfully, user details" + u);
        }
    }*/

