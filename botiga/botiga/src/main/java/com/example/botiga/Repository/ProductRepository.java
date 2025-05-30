package com.example.botiga.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Set;
import com.example.botiga.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Override
    @NonNull
    List findAll();
    Product findByName(String name);
    Set<Product> findByNameAndPrice(String name, float price);
}

