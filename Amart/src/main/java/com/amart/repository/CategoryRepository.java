package com.amart.repository;

import com.amart.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    // You can add custom query methods here if needed
}

