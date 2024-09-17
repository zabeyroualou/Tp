package com.example.testProject.service;

import com.example.testProject.entity.User;

import java.util.List;

public interface UserServices {

    List<User> getAllUser();
    User saveUser(User User);
    User getUserById(Long id);
    User updateUser(User User);
    void deleteUserById(Long id);
}
