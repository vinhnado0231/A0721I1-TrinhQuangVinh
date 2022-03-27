package com.example.phonemanagement.service;

import com.example.phonemanagement.model.Smartphone;
import com.example.phonemanagement.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartphoneService implements ISmartphoneService {
    @Autowired
    private ISmartphoneRepository smartPhoneRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartPhoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return smartPhoneRepository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return smartPhoneRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        smartPhoneRepository.deleteById(id);
    }

    @Override
    public Smartphone findById(Long id, int a) {
        return smartPhoneRepository.findById(id, a);
    }

    @Override
    public Smartphone edit(Smartphone smartphone) {
        return smartPhoneRepository.save(smartphone);

    }
}
