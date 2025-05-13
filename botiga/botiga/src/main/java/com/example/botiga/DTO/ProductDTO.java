package com.example.botiga.DTO;

import com.example.botiga.Model.Categoria;
import com.example.botiga.Model.Subcategoria;

import lombok.Data;

@Data
public class ProductDTO {

    private String nameProduct;
    private String descriptionProduct;
    private String companyProduct;
    private float priceProduct;
    private long unitsProduct;
    private CategoriaDTO categoria;
    private SubcategoriaDTO subcategory;
}
