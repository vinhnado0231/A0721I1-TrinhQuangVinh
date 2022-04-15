package com.example.case_study.service.employee.impl;

import com.example.case_study.model.Position;
import com.example.case_study.repository.IPositionRepository;
import com.example.case_study.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
