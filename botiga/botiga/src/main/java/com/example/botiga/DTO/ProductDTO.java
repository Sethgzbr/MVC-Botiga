package com.example.botiga.DTO;

import com.example.botiga.Model.Categoria;
import com.example.botiga.Model.Subcategoria;

import lombok.Data;

@Data
public class ProductDTO {

    private String nameProcuduct;
    private String descriptionProduct;
    private String companyProduct;
    private float priceProduct;
    private long unitsProduct;
    private Categoria categoria;
    private Subcategoria subcategory;
}
