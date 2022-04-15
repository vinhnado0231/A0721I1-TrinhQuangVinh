package com.example.case_study.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int contract_id;
    Date contract_start_date;
    Date contract_end_date;
    double contract_deposit;
    double contract_total_money;

    @ManyToOne(targetEntity = Employee.class)
    @JoinColumn(name="employee_id")
    private Employee employee;

    @ManyToOne(targetEntity = Customer.class)
    @JoinColumn(name = "customer_id")
    private Customer customers;

    @ManyToOne(targetEntity = Service.class)
    @JoinColumn(name = "service_id")
    private Service services;

    @OneToMany(mappedBy = "contracts")
    Set<ContractDetail> contractDetails;

    public Contract() {
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }

    public Date getContract_start_date() {
        return contract_start_date;
    }

    public void setContract_start_date(Date contract_start_date) {
        this.contract_start_date = contract_start_date;
    }

    public Date getContract_end_date() {
        return contract_end_date;
    }

    public void setContract_end_date(Date contract_end_date) {
        this.contract_end_date = contract_end_date;
    }

    public double getContract_deposit() {
        return contract_deposit;
    }

    public void setContract_deposit(double contract_deposit) {
        this.contract_deposit = contract_deposit;
    }

    public double getContract_total_money() {
        return contract_total_money;
    }

    public void setContract_total_money(double contract_total_money) {
        this.contract_total_money = contract_total_money;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public Service getServices() {
        return services;
    }

    public void setServices(Service services) {
        this.services = services;
    }
}
