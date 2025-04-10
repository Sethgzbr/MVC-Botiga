package com.example.botiga.Model;

import lombok.*;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product implements Serializable{
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
    @Column
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="id_subcategoria")
    private Subcategoria subcategory;
    @Column
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="id_Categoria")
    private Categoria categoria;


/*     @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="subcategory_id")
    private Subcategory subcategory;    */ 
}
