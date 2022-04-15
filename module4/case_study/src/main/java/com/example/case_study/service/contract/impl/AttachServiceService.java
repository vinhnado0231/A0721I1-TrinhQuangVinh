package com.example.case_study.service.contract.impl;


import com.example.case_study.model.AttachService;
import com.example.case_study.repository.IAttachServiceRepository;
import com.example.case_study.service.contract.IAttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceService implements IAttachServiceService {
    @Autowired
    private IAttachServiceRepository attachServiceRepository;

    @Override
    public List<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }
}
