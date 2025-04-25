package com.example.botiga.Service;

import java.util.List;
import java.util.Optional;

public interface BotigaService {
    List<?> findAll();

    Object findById(Long id);

    void save(Object entity);

    void deleteById(Long id);
}