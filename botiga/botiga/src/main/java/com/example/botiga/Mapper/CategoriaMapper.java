package com.example.botiga.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.example.botiga.DTO.CategoriaDTO;
import com.example.botiga.Model.Categoria;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoriaMapper {

    @Mapping(target = "descCategoria", source = "categoria.descCategoria")
    @Mapping(target = "statusCategoria", source = "categoria.statusCategoria")
    @Mapping(target = "subcategoria", source = "categoria.subcategory")
    CategoriaDTO CategoriaToCategoriaDTO(Categoria categoria);

    @Mapping(target = "descCategoria", source = "categoriaDTO.descCategoria")
    @Mapping(target = "statusCategoria", source = "categoriaDTO.statusCategoria")
    @Mapping(target = "subcategory", source = "categoriaDTO.subcategoria")
    Categoria CategoriaDTOToCategoria(CategoriaDTO categoriaDTO);

}