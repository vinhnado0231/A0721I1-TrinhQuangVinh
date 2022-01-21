package repository;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getCustomerList();
    void insertCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(Customer customer);
    Customer selectCustomerById(int id);

}