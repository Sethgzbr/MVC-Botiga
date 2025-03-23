package com.example.botiga.Service;

import java.util.Set;
import com.example.botiga.Model.Product;

public interface ProductService {
 
    Set<Product> findAllProducts();
    Product findProductsByName(String name);
    Set<Product> findAllProducts(String subcategory);
    void increasePrice(Product product);
}

