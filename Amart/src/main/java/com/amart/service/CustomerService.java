package com.amart.service;

import com.amart.model.Customer;
import com.amart.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Optional<Customer> updateCustomer(Integer id, Customer updatedCustomer) {
        return customerRepository.findById(id)
                .map(customer -> {
                    customer.setCustName(updatedCustomer.getCustName());
                    customer.setAddress(updatedCustomer.getAddress());
                    customer.setContNo(updatedCustomer.getContNo());
                    customer.setEmail(updatedCustomer.getEmail());
                    return customerRepository.save(customer);
                });
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }
}
