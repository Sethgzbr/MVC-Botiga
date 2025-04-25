package com.example.botiga.DTO;

import com.example.botiga.Model.Categoria;
import com.example.botiga.Model.Subcategoria;

public class ProducteDTO {

    private String nameProcuduct;

    private String descriptionProduct;

    private String companyProduct;

    private float priceProduct;

    private long unitsProduct;

    private Categoria categoria;

    private Subcategoria subcategory;
    // Geters Setters

    public String getNameProcuduct() {
        return nameProcuduct;
    }

    public void setNameProcuduct(String nameProcuduct) {
        this.nameProcuduct = nameProcuduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public String getCompanyProduct() {
        return companyProduct;
    }

    public void setCompanyProduct(String companyProduct) {
        this.companyProduct = companyProduct;
    }

    public float getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(float priceProduct) {
        this.priceProduct = priceProduct;
    }

    public long getUnitsProduct() {
        return unitsProduct;
    }

    public void setUnitsProduct(long unitsProduct) {
        this.unitsProduct = unitsProduct;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Subcategoria getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Subcategoria subcategory) {
        this.subcategory = subcategory;
    }
}
