package com.example.botiga.Model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_Categoria;
    @Column
    private String descCategoria;
    @Column
    private String statusCategoria;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_subcategoria")
    private Subcategoria subcategory;
    @Column
    private LocalDateTime creation_at;
    @Column
    private LocalDateTime updated_at;
}
