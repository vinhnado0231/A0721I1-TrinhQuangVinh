package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getCustomerList();

    void createCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    void updateCustomer(Customer customer);

    List<Customer> searchCustomer(String name);

    Customer getCustomerById(int id);
}
