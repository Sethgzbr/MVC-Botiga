package com.example.botiga.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.botiga.Model.Product;
import com.example.botiga.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements BotigaService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Object entity) {
        if (!(entity instanceof Product)) {
            throw new IllegalArgumentException("Entity must be a Product");
        }
        productRepository.save((Product) entity);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public Object findByName(String name) {
        return productRepository.findByName(name);
    }
}