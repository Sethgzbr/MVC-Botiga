package com.example.botiga.Model;

import java.io.Serializable;
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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String company;

    @Column
    private float price;

    @Column
    private long units;

    @Column(name = "creation_at")
    private LocalDateTime creationDate;

    @Column(name = "updated_at")
    private LocalDateTime updateDate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_subcategoria")
    private Subcategoria subcategory;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_Categoria")
    private Categoria categoria;
}