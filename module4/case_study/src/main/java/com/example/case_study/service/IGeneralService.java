package com.example.case_study.service;


import com.example.case_study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGeneralService<T> {
    Page<T> findAll(Pageable pageable);

    T findById(int id);

    void save(T t);

    void remove(int id);
}
