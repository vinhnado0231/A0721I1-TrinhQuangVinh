package com.example.case_study.service.login.impl;

import com.example.case_study.model.Role;
import com.example.case_study.service.login.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    IRoleService roleRepository;
    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    public List<Role> findAll() {
        return (List<Role>) roleRepository.findAll();
    }

    @Override
    public Role findById(int id) {
        return roleRepository.findById(id);
    }
}
