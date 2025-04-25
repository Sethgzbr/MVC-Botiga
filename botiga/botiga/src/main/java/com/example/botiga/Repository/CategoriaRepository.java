package com.example.botiga.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Set;
import com.example.botiga.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    @Override
    @NonNull
    List findAll();
    Categoria findByName(String name);
    Set<Categoria> findByNameAndPrice(String name, float price);   
}
