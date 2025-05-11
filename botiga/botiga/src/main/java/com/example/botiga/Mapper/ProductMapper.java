package com.example.botiga.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.example.botiga.DTO.ProductDTO;
import com.example.botiga.Model.Product;

@Mapper(componentModel = "spring", uses = {CategoriaMapper.class, SubcategoriaMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

    @Mapping(target = "nameProduct", source = "product.name")
    @Mapping(target = "descriptionProduct", source = "product.description")
    @Mapping(target = "companyProduct", source = "product.company")
    @Mapping(target = "priceProduct", source = "product.price")
    @Mapping(target = "unitsProduct", source = "product.units")
    @Mapping(target = "categoria", source = "product.categoria")
    @Mapping(target = "subcategory", source = "product.subcategory")
    ProductDTO ProductToProducteDTO(Product product);

    @Mapping(target = "name", source = "producteDTO.nameProduct")
    @Mapping(target = "description", source = "producteDTO.descriptionProduct")
    @Mapping(target = "company", source = "producteDTO.companyProduct")
    @Mapping(target = "price", source = "producteDTO.priceProduct")
    @Mapping(target = "units", source = "producteDTO.unitsProduct")
    @Mapping(target = "categoria", source = "producteDTO.categoria")
    @Mapping(target = "subcategory", source = "producteDTO.subcategory")
    Product ProducteDTOToProduct(ProductDTO producteDTO);

    List<ProductDTO> ProductsToProductsDTO (List<Product> products);
    List<Product> ProductsDTOToProducts (List<ProductDTO> productsDTO);
}