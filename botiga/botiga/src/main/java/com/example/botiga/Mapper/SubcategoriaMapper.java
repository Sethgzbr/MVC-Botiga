package com.example.botiga.Mapper;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.example.botiga.DTO.SubcategoriaDTO;
import com.example.botiga.Model.Subcategoria;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SubcategoriaMapper {

    @Mapping(target = "desc_Subcategoria", source = "subcategoria.desc_Subcategoria")
    @Mapping(target = "status_Subcategoria", source = "subcategoria.status_Subcategoria")
    @Mapping(target = "categoria", source = "subcategoria.categoria")
    SubcategoriaDTO SubcategoriaToSubcategoriaDTO(Subcategoria subcategoria);

    @Mapping(target = "desc_Subcategoria", source = "subcategoriaDTO.desc_Subcategoria")
    @Mapping(target = "status_Subcategoria", source = "subcategoriaDTO.status_Subcategoria")
    @Mapping(target = "categoria", source = "subcategoriaDTO.categoria")
    Subcategoria SubcategoriaDTOToSubcategoria(SubcategoriaDTO subcategoriaDTO);

    Set<SubcategoriaDTO> SubcategoriesToSubcategoriesDTO (Set<Subcategoria> subcategories);
    Set<Subcategoria> SubcategoriesDTOToSubcategories (Set<SubcategoriaDTO> subcategoriesDTO);
}
