package com.example.botiga.Repository;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.example.botiga.Model.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>  {
    @Override
    @NonNull
    Set<Categoria> findAll();
    Optional<Categoria> findById(Long id);
}
