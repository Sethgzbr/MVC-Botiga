package com.example.botiga.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;
import com.example.botiga.Model.Product;
import com.example.botiga.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Set<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Set<Product> findAllProducts(String subcategory) {
        return null;
    }

    @Override
    public Product findProductsByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public void increasePrice(Product product) {

    }
}

