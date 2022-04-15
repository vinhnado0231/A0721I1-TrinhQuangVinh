package com.example.case_study.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.sql.Date;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int employee_id;
    @NotEmpty(message = "Vui long nhap ten")
    String employee_name;
    Date employee_birthday;
    @NotEmpty(message = "Vui long nhap CMND")
    @Pattern(regexp = "^[0-9]{9}|[0-9]{12}$", message = "Vui long nhap dung dinh dang CMND 9/12 so")
    String employee_card;
    double employee_salary;
    @NotEmpty(message = "Vui long nhap SDT")
    @Pattern(regexp = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$",message = "SDT khong dung dinh dang")
    String employee_phone;
    @NotEmpty(message = "Vui long nhap email")
    @Pattern(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$",message = "email khong dung dinh dang")
    String employee_email;
    @NotEmpty(message = "Vui long nhap dia chi")
    String employee_address;
    @ManyToOne(targetEntity = Position.class)
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;
    @ManyToOne(targetEntity = EducationDegree.class)
    @JoinColumn(name = "education_degree_id", nullable = false)
    private EducationDegree educationDegree;
    @ManyToOne(targetEntity = Division.class)
    @JoinColumn(name = "division_id", nullable = false)
    private Division division;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "userName")
    private User user;

    public Employee() {
    }

    @OneToMany(mappedBy = "employee")
    private Set<Contract> contracts;

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Date getEmployee_birthday() {
        return employee_birthday;
    }

    public void setEmployee_birthday(Date employee_birthday) {
        this.employee_birthday = employee_birthday;
    }

    public String getEmployee_card() {
        return employee_card;
    }

    public void setEmployee_card(String employee_card) {
        this.employee_card = employee_card;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }
}