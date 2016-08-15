package ru.javarush.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javarush.dao.UserDAO;
import ru.javarush.model.User;
import ru.javarush.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Transactional
    public void add(User user) {
        userDAO.add(user);

    }
    @Transactional
    public void edit(User user) {
        userDAO.edit(user);
    }
    @Transactional
    public void delete(int id) {
        userDAO.delete(id);
    }
    @Transactional
    public User getUser(int id) {
        return userDAO.getUser(id);
    }
    @Transactional
    public List getAllUsers() {
        return userDAO.getAllUsers();
    }
}
