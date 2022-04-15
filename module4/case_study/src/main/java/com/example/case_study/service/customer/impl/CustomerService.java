package com.example.case_study.service.customer.impl;

import com.example.case_study.model.Customer;
import com.example.case_study.repository.ICustomerRepository;
import com.example.case_study.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    @Override
    public Page<Customer> findAllUseService(Pageable pageable) {
        return customerRepository.findAllUseService(pageable);
    }
}
