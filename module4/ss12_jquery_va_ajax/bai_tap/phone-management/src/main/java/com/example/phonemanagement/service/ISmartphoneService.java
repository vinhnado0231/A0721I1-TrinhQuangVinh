package com.example.phonemanagement.service;

import com.example.phonemanagement.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone findById(Long id,int a);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);

    Smartphone edit(Smartphone smartphone);
}