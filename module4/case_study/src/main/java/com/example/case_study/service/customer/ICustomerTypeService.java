package com.example.case_study.service.customer;


import com.example.case_study.model.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
