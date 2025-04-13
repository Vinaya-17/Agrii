package com.amart.service;

import com.amart.model.Product;
import com.amart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> updateProduct(Integer id, Product updatedProduct) {
        return productRepository.findById(id)
                .map(product -> {
                    product.setProdName(updatedProduct.getProdName());
                    product.setCatId(updatedProduct.getCatId());
                    product.setPrice(updatedProduct.getPrice());
                    return productRepository.save(product);
                });
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
}
