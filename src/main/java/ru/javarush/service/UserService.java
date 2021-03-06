package ru.javarush.service;


import ru.javarush.model.User;

import java.util.List;

public interface UserService {

    public void add(User user);
    public void edit(User user);
    public void delete(int id);
    public User getUser(int id);
    public List getAllUsers();
}
