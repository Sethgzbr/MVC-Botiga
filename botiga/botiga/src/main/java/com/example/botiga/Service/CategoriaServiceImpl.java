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
public class CategoriaServiceImpl implements BotigaService {
    
    private final CategoriaRepository categoriaRepository;
    private final CategoriaMapper categoriaMapper;
    
    @Autowired
    public CategoriaServiceImpl(CategoriaRepository categoriaRepository, CategoriaMapper categoriaMapper) {
        this.categoriaRepository = categoriaRepository;
        this.categoriaMapper = categoriaMapper;
    }

    @Override
    public Set<CategoriaDTO> findAll(){
        Set<Categoria> categories = categoriaRepository.findAll();
        return categoriaMapper.CategoriesToCategoriesDTO(categories);
    }


    public void save(CategoriaDTO categoria){
        Categoria categoriaEntity = categoriaMapper.CategoriaDTOToCategoria(categoria);
        categoriaRepository.save(categoriaEntity);
    }

    @Override
    public Optional<CategoriaDTO> findById(Long id){
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.map(categoriaMapper::CategoriaToCategoriaDTO);
    }

    @Override
    public void deleteById(Long id){
        categoriaRepository.deleteById(id);
    }

    
    @Override
    public String findDescripcionById(Long id) {
        Categoria categoria = categoriaRepository.findById(id).orElse(null);
        if (categoria != null) {
            return categoria.getDescCategoria();
        }
        return null;
    }


}