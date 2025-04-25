package com.example.botiga.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Set;
import com.example.botiga.Model.Subcategoria;

@Repository
public interface SubcategoriaRepository extends JpaRepository<Subcategoria, Long> {
    @Override
    @NonNull
    List findAll();
    Subcategoria findByName(String name);
    Set<Subcategoria> findByNameAndPrice(String name, float price);   
}