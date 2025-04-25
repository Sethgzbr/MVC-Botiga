package com.example.botiga.Model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "subcategories")
public class Subcategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id_Subcategoria;
    @Column
    private String desc_Subcategoria;
    @Column
    private String status_Subcategoria;
    @Column
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="id_Categoria")
    private Categoria categoria;
    @Column
    private LocalDate creation_at;
    @Column
    private LocalDate updated_at;
    
}
