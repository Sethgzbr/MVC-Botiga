package com.example.botiga.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.example.botiga.Model.Subcategoria;

@Repository
public interface SubcategoriaRepository extends JpaRepository<Subcategoria, Long>  {
    @Override
    @NonNull
    List<Subcategoria> findAll();
    Optional<Subcategoria> findById(Long id);

}