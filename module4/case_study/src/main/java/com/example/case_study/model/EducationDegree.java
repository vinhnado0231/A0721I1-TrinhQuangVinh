package com.example.case_study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "education_degree")
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int education_degree_id;
    String educatiom_degree_name;

    public EducationDegree() {
    }

    @OneToMany(mappedBy = "educationDegree")
    private Set<Employee> employee;



    public int getEducation_degree_id() {
        return education_degree_id;
    }

    public void setEducation_degree_id(int education_degree_id) {
        this.education_degree_id = education_degree_id;
    }

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    public String getEducatiom_degree_name() {
        return educatiom_degree_name;
    }

    public void setEducatiom_degree_name(String educatiom_degree_name) {
        this.educatiom_degree_name = educatiom_degree_name;
    }
}
