package com.example.botiga.DTO;

public class CategoriaDTO {
    private String descCategoria;
    private String statusCategoria;
    private SubcategoriaDTO subcategoria;

    // Getters y Setters
    public String getDesc_Categoria() {
        return descCategoria;
    }

    public void setDesc_Categoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }

    public String getStatus_Categoria() {
        return statusCategoria;
    }

    public void setStatus_Categoria(String statusCategoria) {
        this.statusCategoria = statusCategoria;
    }

    public SubcategoriaDTO getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(SubcategoriaDTO subcategoria) {
        this.subcategoria = subcategoria;
    }
}
