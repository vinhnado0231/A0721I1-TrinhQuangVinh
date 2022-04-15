package com.example.case_study.repository;

import com.example.case_study.model.Customer;
import com.example.case_study.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(value = "select * from employee where employee_id = ?1", nativeQuery = true)
    Employee findById(int id);
}
