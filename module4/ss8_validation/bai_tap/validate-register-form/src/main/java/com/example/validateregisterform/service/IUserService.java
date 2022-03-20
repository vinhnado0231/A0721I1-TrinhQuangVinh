package com.example.validateregisterform.service;

import com.example.validateregisterform.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void save(User user);
}
