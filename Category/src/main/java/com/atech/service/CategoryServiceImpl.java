package com.atech.service;
import com.atech.model.Category;
import com.atech.repository.CategoryRepository;
import com.atech.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

	@Service
		public class CategoryServiceImpl implements CategoryService {
		@Autowired
	    private CategoryRepository categoryRepository;

	    @Override
	    public Category saveCategory(Category category) {
	        return categoryRepository.save(category);
	    }

	    @Override
	    public List<Category> getAllCategory() {
	        return categoryRepository.findAll();
	    }
	    @Override
	    public Category getCategoryById(id) {
	        Optional<Category> category = categoryRepository.findById(id);
	        return category.orElseThrow(() -> new RuntimeException("Category not found"));
	    }

	    @Override
	    public void deleteCategory(Long id) {
	        categoryRepository.deleteById(id);
	    }
	}

	
