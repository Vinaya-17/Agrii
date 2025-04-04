package com.atech.service;
import com.atech.model.Product;
import java.util.List;
public interface ProductService {
	Product saveProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(int productId);

    void deleteProduct(int productId);
}




   