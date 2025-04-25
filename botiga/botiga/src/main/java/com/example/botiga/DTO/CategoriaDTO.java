package com.example.botiga.DTO;

import lombok.Data;

@Data
public class CategoriaDTO {
    private String desc_Categoria;
    private String status_Categoria;
    private SubcategoriaDTO subcategoria;
}
