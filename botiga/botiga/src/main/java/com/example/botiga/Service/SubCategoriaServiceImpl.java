package com.example.botiga.Service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.botiga.DTO.SubcategoriaDTO;
import com.example.botiga.Mapper.SubcategoriaMapper;
import com.example.botiga.Model.Subcategoria;
import com.example.botiga.Repository.SubcategoriaRepository;

@Service
public class SubCategoriaServiceImpl implements BotigaService {

    private SubcategoriaRepository subcategoriaRepository;
    private final SubcategoriaMapper subcategoriaMapper;

    @Autowired
    public SubCategoriaServiceImpl(SubcategoriaRepository subcategoriaRepository, SubcategoriaMapper subcategoriaMapper) {
        this.subcategoriaRepository = subcategoriaRepository;
        this.subcategoriaMapper = subcategoriaMapper;
    }

    @Override
    public Set<SubcategoriaDTO> findAll() {
        Set<Subcategoria> subcategorias = subcategoriaRepository.findAll();
        return subcategoriaMapper.SubcategoriesToSubcategoriesDTO(subcategorias);
    }

    @Override
    public Optional<SubcategoriaDTO> findById(Long id) {
        Optional<Subcategoria> subcategoria = subcategoriaRepository.findById(id);
        return subcategoria.map(subcategoriaMapper::SubcategoriaToSubcategoriaDTO);
    }

    @Override
    public void save(Object entity) {
        if (!(entity instanceof SubcategoriaDTO)) {
            throw new IllegalArgumentException("Entity must be a SubcategoriaDTO");
        }
        Subcategoria subcategoria = subcategoriaMapper.SubcategoriaDTOToSubcategoria((SubcategoriaDTO) entity);
        subcategoriaRepository.save(subcategoria);
    }

    @Override
    public void deleteById(Long id) {
        subcategoriaRepository.deleteById(id);
    }

    /*  Método adicional específico para subcategorías
    public List<Subcategoria> findByCategoriaId(Long categoriaId) {
        return subcategoriaRepository.findByCategoria_Id_Categoria(categoriaId);
    }*/


    @Override
    public String findDescripcionById(Long id) {
        Subcategoria subcategoria = subcategoriaRepository.findById(id).orElse(null);
        if (subcategoria != null) {
            return subcategoria.getDesc_Subcategoria();
        }
        return null;
    }
}