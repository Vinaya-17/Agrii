package com.atech.service;
import com.atech.model.Category;
import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);
    List<Category> getAllCategory();
    Category getCategoryById(Long id);
    void deleteCategory(Long id);
	Category getCategoryById(Integer id);
}