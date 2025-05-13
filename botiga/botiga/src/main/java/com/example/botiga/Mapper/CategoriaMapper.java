package com.example.botiga.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.example.botiga.DTO.CategoriaDTO;
import com.example.botiga.Model.Categoria;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoriaMapper {

    @Mapping(target = "desc_Categoria", source = "categoria.descCategoria")
    @Mapping(target = "status_Categoria", source = "categoria.statusCategoria")
    @Mapping(target = "subcategoria", source = "categoria.subcategory")
    CategoriaDTO CategoriaToCategoriaDTO(Categoria categoria);

    @Mapping(target = "descCategoria", source = "categoriaDTO.desc_Categoria")
    @Mapping(target = "statusCategoria", source = "categoriaDTO.status_Categoria")
    @Mapping(target = "subcategory", source = "categoriaDTO.subcategoria")
    Categoria CategoriaDTOToCategoria(CategoriaDTO categoriaDTO);

    List<CategoriaDTO> CategoriesToCategoriesDTO (List<Categoria> categories);
    List<Categoria> CategoriesDTOToCategories (List<CategoriaDTO> categoriesDTO);

}