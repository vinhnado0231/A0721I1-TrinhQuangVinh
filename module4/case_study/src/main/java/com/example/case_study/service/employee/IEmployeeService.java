package com.example.case_study.service.employee;

import com.example.case_study.model.Employee;
import com.example.case_study.service.IGeneralService;

import java.util.List;

public interface IEmployeeService extends IGeneralService<Employee> {
    Employee findById(int id);

    List<Employee> findAll();
}
