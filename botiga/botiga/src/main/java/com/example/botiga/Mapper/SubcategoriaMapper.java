package com.example.botiga.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.example.botiga.DTO.SubcategoriaDTO;
import com.example.botiga.Model.Subcategoria;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SubcategoriaMapper {

    @Mapping(target = "SubcategoriaDTO.desc_Subcategoria", source = "Subcategoria.desc_Subcategoria")
    @Mapping(target = "SubcategoriaDTO.status_Subcategoria", source = "Subcategoria.status_Subcategoria")
    @Mapping(target = "SubcategoriaDTO.categoria", source = "Subcategoria.categoria")
    SubcategoriaDTO SubcategoriaToSubcategoriaDTO(Subcategoria subcategoria);

    @Mapping(target = "Subcategoria.desc_Subcategoria", source = "desc_Subcategoria")
    @Mapping(target = "Subcategoria.status_Subcategoria", source = "status_Subcategoria")
    @Mapping(target = "Subcategoria.categoria", source = "categoria")
    Subcategoria SubcategoriaDTOToSubcategoria(SubcategoriaDTO subcategoriaDTO);
}
