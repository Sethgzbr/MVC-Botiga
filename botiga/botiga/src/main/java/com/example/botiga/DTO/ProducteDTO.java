package com.example.botiga.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class ProducteDTO {

    private String name_Procuduct;

    private String description_Product;

    private String company_Product;

    private float price_Product;

    private long units_Product;

    private Categoria categoria;

    private Subcategoria subcategory;
}
