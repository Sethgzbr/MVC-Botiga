package com.example.botiga.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.botiga.Model.Categoria;
import com.example.botiga.Model.Subcategoria;
import com.example.botiga.Repository.CategoriaRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements BotigaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public void save(Object entity) {
        if (!(entity instanceof Categoria)) {
            throw new IllegalArgumentException("Entity must be a Categoria");
        }
        categoriaRepository.save((Categoria) entity);
    }

    @Override
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }

    // Método adicional específico para categorías
    public List<Categoria> findByCategoriaId(Long categoriaId) {
        return CategoriaRepository.findByCategoria_Id_Categoria(categoriaId);
    }
}