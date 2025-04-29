package com.example.botiga.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import com.example.botiga.Model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    @Override
    @NonNull
    List<Categoria> findAll();
    Optional<Categoria> findById(Long id);
}
