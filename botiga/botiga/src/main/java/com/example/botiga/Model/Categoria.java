package com.example.botiga.Model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Categoria {
    @Column
    private long id_Categoria;
    @Column
    private String desc_Categoria;
    @Column
    private String status_Categoria;
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="id_subcategoria")
    private Subcategoria subcategory;
    @Column
    private LocalDateTime creation_at;
    @Column
    private LocalDateTime updated_at;
}
