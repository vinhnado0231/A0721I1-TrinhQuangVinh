package com.example.case_study.service.service.impl;

import com.example.case_study.model.Service;
import com.example.case_study.repository.IServiceRepository;
import com.example.case_study.service.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService implements IServiceService {
    @Autowired
    private IServiceRepository serviceRepository;

    @Override
    public void save(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public Page<Service> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Service findById(int id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(int id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public List<Service> findAll() {
        return serviceRepository.findAll();
    }
}