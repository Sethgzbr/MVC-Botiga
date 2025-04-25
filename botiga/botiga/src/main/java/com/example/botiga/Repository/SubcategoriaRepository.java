package com.example.botiga.Repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.example.botiga.Model.Subcategoria;

@Repository
public interface SubcategoriaRepository extends JpaRepository<Subcategoria, Long> {
    @Override
    @NonNull
    List findAll();

    Subcategoria findByName(String name);

    Set<Subcategoria> findByNameAndPrice(String name, float price);

    List<Subcategoria> findByCategoria_Id_Categoria(Long categoriaId);
}