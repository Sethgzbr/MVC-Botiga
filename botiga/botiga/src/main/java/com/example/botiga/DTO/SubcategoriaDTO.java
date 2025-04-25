package com.example.botiga.DTO;

public class SubcategoriaDTO {

    private String desc_Subcategoria;
    private String status_Subcategoria;
    private CategoriaDTO categoria;

    // Getters Setters
    public String getDesc_Subcategoria() {
        return desc_Subcategoria;
    }

    public void setDesc_Subcategoria(String desc_Subcategoria) {
        this.desc_Subcategoria = desc_Subcategoria;
    }

    public String getStatus_Subcategoria() {
        return status_Subcategoria;
    }

    public void setStatus_Subcategoria(String status_Subcategoria) {
        this.status_Subcategoria = status_Subcategoria;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }

}
