package com.example.botiga.Service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.botiga.DTO.CategoriaDTO;
import com.example.botiga.Mapper.CategoriaMapper;
import com.example.botiga.Model.Categoria;
import com.example.botiga.Repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl {

    private final CategoriaRepository categoriaRepository;
    private final CategoriaMapper categoriaMapper;
    
    @Autowired
    public CategoriaServiceImpl(CategoriaRepository categoriaRepository, CategoriaMapper categoriaMapper) {
        this.categoriaRepository = categoriaRepository;
        this.categoriaMapper = categoriaMapper;
    }

    public Set<CategoriaDTO> findAll(){
        Set<Categoria> categories = categoriaRepository.findAll();
        return categoriaMapper.CategoriesDTOToCategories(categories);
    }

    @Override
    public CategoriaDTO findByName(String name){
        Categoria categoria = categoriaRepository.findByName(name);
        return categoriaMapper.CategoriaToCategoriaDTO(categoria);
    }

    @Override
    public void save(CategoriaDTO categoria){
        Categoria categoriaEntity = categoriaMapper.CategoriaDTOToCategoria(categoria);
        categoriaRepository.save(categoriaEntity);
    }

    @Override
    Optional<Categoria> findById(Long id){

    }
    void deleteById(Long id);
    Optional<Categoria> findByCategoriaId(Long id);

    
}