package com.example.botiga.Service;

import java.util.Set;

public interface BotigaService {
    Set<?> findAll();
    Object findById(Long id);
    void save(Object entity);
    void deleteById(Long id);

    //Endpoints opcionals punt 11
    String findDescripcionById(Long id);
}