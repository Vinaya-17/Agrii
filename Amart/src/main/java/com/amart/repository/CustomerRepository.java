package com.amart.repository;

import com.amart.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // You can add custom query methods here if needed
}
