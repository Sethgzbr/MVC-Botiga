package com.example.botiga.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.botiga.Model.Subcategoria;
import com.example.botiga.Repository.SubcategoriaRepository;

@Service
public class SubCategoriaServiceImpl implements BotigaService {

    @Autowired
    private SubcategoriaRepository subcategoriaRepository;

    @Override
    public List<Subcategoria> findAll() {
        return subcategoriaRepository.findAll();
    }

    @Override
    public Optional<Subcategoria> findById(Long id) {
        return subcategoriaRepository.findById(id);
    }

    @Override
    public void save(Object entity) {
        if (!(entity instanceof Subcategoria)) {
            throw new IllegalArgumentException("Entity must be a Subcategoria");
        }
        subcategoriaRepository.save((Subcategoria) entity);
    }

    @Override
    public void deleteById(Long id) {
        subcategoriaRepository.deleteById(id);
    }

    // Método adicional específico para subcategorías
    public List<Subcategoria> findByCategoriaId(Long categoriaId) {
        return subcategoriaRepository.findByCategoria_Id_Categoria(categoriaId);
    }

    @Override
    public String findDescripcionById(Long id) {
        Subcategoria subcategoria = subcategoriaRepository.findById(id).orElse(null);
        if (subcategoria != null) {
            return subcategoria.getDesc_Subcategoria();
        }
        return null;
    }
}