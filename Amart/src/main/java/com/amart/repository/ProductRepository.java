package com.amart.repository;

import com.amart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // You can add custom query methods here if needed
}
