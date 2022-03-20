package com.example.validateregisterform.service.impl;

import com.example.validateregisterform.model.User;
import com.example.validateregisterform.repository.UserRepository;
import com.example.validateregisterform.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
