package com.example.case_study.service.employee.impl;

import com.example.case_study.model.Division;
import com.example.case_study.repository.IDivisionRepository;
import com.example.case_study.service.employee.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    private IDivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}