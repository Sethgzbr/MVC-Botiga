package com.example.botiga.Mapper;

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

    @Mapping(target = "descCategoria", source = "desc_Categoria")
    @Mapping(target = "statusCategoria", source = "status_Categoria")
    @Mapping(target = "subcategory", source = "subcategoria")
    Categoria CategoriaDTOToCategoria(CategoriaDTO categoriaDTO);

}