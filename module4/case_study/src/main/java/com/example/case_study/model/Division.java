package com.example.case_study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int division_id;

    String divition_name;

    public Division() {
    }

    @OneToMany(mappedBy = "division")
    private Set<Employee> employee;

    public Set<Employee> getEmployee() {
        return employee;
    }


    public String getDivition_name() {
        return divition_name;
    }

    public void setDivition_name(String divition_name) {
        this.divition_name = divition_name;
    }

    public int getDivision_id() {
        return division_id;
    }

    public void setDivision_id(int division_id) {
        this.division_id = division_id;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }
}
