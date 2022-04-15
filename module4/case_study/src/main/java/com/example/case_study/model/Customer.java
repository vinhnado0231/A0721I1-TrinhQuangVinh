package com.example.case_study.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.sql.Date;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customer_id;
    @NotEmpty(message = "Vui long nhap ten")
    String customer_name;
    Date customer_birthday;
    Boolean customer_gender;
    @NotEmpty(message = "Vui long nhap CMND")
    @Pattern(regexp = "^[0-9]{9}|[0-9]{12}$", message = "Vui long nhap dung dinh dang CMND 9/12 so")
    String customer_id_card;
    @NotEmpty(message = "Vui long nhap SDT")
    @Pattern(regexp = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$",message = "SDT khong dung dinh dang")
    String customer_phone;
    @NotEmpty(message = "Vui long nhap email")
    @Pattern(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$",message = "email khong dung dinh dang")
    String customer_email;
    @NotEmpty(message = "Vui long nhap dia chi")
    String customer_address;

    public Customer() {
    }

    @ManyToOne(targetEntity = CustomerType.class)
    @JoinColumn(name = "type_id", nullable = false)
    private CustomerType customerType;

    @OneToMany(mappedBy = "customers")
    Set<Contract> contracts;

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Date getCustomer_birthday() {
        return customer_birthday;
    }

    public void setCustomer_birthday(Date customer_birthday) {
        this.customer_birthday = customer_birthday;
    }

    public Boolean getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(Boolean customer_gender) {
        this.customer_gender = customer_gender;
    }

    public String getCustomer_id_card() {
        return customer_id_card;
    }

    public void setCustomer_id_card(String customer_id_card) {
        this.customer_id_card = customer_id_card;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }
}

