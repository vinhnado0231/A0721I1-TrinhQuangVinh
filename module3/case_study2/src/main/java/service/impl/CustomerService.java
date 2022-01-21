package service.impl;

import model.Customer;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private CustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> getCustomerList() {
        List<Customer> customerList = customerRepository.getCustomerList();
        return customerList;
    }

    @Override
    public void createCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(Customer customer) {

    }


    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public List<Customer> searchCustomer(String name) {
        return null;
    }
    @Override
    public Customer getCustomerById(int id) {
        Customer customer=customerRepository.selectCustomerById(id);
        return customer;
    }
}
