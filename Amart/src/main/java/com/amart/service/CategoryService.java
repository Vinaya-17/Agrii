package com.amart.service;

import com.amart.model.Category;
import com.amart.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(Integer id) {
        return categoryRepository.findById(id);
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Optional<Category> updateCategory(Integer id, Category updatedCategory) {
        return categoryRepository.findById(id)
                .map(category -> {
                    category.setCatName(updatedCategory.getCatName());
                    return categoryRepository.save(category);
                });
    }

    public void deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
    }
}
