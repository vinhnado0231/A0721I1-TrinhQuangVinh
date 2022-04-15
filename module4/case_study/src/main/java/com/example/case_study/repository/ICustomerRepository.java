package com.example.case_study.repository;

import com.example.case_study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findAll(Pageable pageable);

    @Query(value = "select * from customer where customer_id = ?1", nativeQuery = true)
    Customer findById(int id);

    @Query(value = "select * from customer inner join contract on customer.customer_id=contract.customer_id inner join contract_detail on contract_detail.contract_id=contract.contract_id inner join attach_service on attach_service.attach_service_id=contract_detail.attach_service_id group by contract.contract_id", nativeQuery = true)
    Page<Customer> findAllUseService(Pageable pageable);
}
