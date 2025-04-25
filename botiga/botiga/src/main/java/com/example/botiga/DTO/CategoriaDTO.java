package com.example.botiga.DTO;

public class CategoriaDTO {
    private String desc_Categoria;
    private String status_Categoria;
    private SubcategoriaDTO subcategoria;

    // Getters y Setters
    public String getDesc_Categoria() {
        return desc_Categoria;
    }

    public void setDesc_Categoria(String desc_Categoria) {
        this.desc_Categoria = desc_Categoria;
    }

    public String getStatus_Categoria() {
        return status_Categoria;
    }

    public void setStatus_Categoria(String status_Categoria) {
        this.status_Categoria = status_Categoria;
    }

    public SubcategoriaDTO getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(SubcategoriaDTO subcategoria) {
        this.subcategoria = subcategoria;
    }
}
