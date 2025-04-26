package com.example.botiga.Service;

import java.util.List;

public interface BotigaService {
    List<?> findAll();
    Object findById(Long id);
    void save(Object entity);
    void deleteById(Long id);

    //Endpoints opcionals punt 11
    String findDescripcionById(Long id);
}