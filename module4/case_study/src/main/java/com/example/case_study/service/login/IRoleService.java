package com.example.case_study.service.login;

import com.example.case_study.model.Role;

import java.util.List;

public interface IRoleService {
    Role findByName(String name);
    List<Role> findAll();
    Role findById(int id);
}
