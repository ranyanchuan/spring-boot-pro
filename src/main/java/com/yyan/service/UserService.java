package com.yyan.service;

import com.yyan.pojo.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getAll();

    User getUserById(Integer id);

    void updateUser(User user);
}
