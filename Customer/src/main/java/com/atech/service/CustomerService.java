package com.atech.service;


import com.atech.model.Customer;
import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer getCustomerByEmail(String email);
    void deleteCustomer(Long id);
}
