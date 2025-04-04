package com.atech.service;


import com.atech.model.Product;
import com.atech.repository.ProductRepository;
import com.atech.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int productId) {
        Optional<Product> product = productRepository.findById(productId);
        return product.orElse(null);  // Return null if not found
    }

    @Override
    public void deleteProduct(int productId) {
        productRepository.deleteById(productId);
    }
}

