package ru.javarush.dao.impl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.javarush.dao.UserDAO;
import ru.javarush.model.User;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{
    @Autowired
    private SessionFactory session;

    public void add(User user) {
        session.getCurrentSession().save(user);
    }

    public void edit(User user) {
        session.getCurrentSession().update(user);
    }

    public void delete(int id) {
        session.getCurrentSession().delete(getUser(id));
    }

    public User getUser(int id) {
        return (User) session.getCurrentSession().get(User.class, id);
    }

    public List getAllUsers() {
        return session.getCurrentSession().createQuery("from User").list();
    }
}
