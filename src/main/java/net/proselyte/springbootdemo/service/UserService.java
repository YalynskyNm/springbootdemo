package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    void delete(User user);

    void update(User user);

    List<User> listUsers();

    User getUserById(long id);
}