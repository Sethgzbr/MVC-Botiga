package com.example.botiga.Repository;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.example.botiga.Model.Subcategoria;

@Repository
public interface SubcategoriaRepository extends CrudRepository<Subcategoria, Long>  {
    @Override
    @NonNull
    Set<Subcategoria> findAll();
    Optional<Subcategoria> findById(Long id);

}