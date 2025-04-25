package com.example.botiga.Controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.botiga.DTO.CategoriaDTO;
import com.example.botiga.DTO.ProductDTO;
import com.example.botiga.DTO.SubcategoriaDTO;
import com.example.botiga.Service.CategoriaServiceImpl;
import com.example.botiga.Service.ProductServiceImpl;
import com.example.botiga.Service.SubCategoriaServiceImpl;

@RestController
@RequestMapping("/api/botiga")
public class ApiController {

    @Autowired
    private ProductServiceImpl productService;

    @Autowired
    private CategoriaServiceImpl categoriaService;

    @Autowired
    private SubCategoriaServiceImpl subCategoriaService;

    // Nou Producte
    @PostMapping("/inserirProducte")
    public ResponseEntity<String> inserirProducte(@RequestBody ProductDTO productDTO) {
        productService.save(productDTO);
        return ResponseEntity.ok("Producte inserit correctament.");
    }

    // Llistat tots els productes
    @GetMapping("/LlistarProductes")
    public ResponseEntity<Set<ProductDTO>> llistarProductes() {
        return ResponseEntity.ok(productService.findAll());
    }

    // Cerca de producte per nom
    @GetMapping("/CercaProductes")
    public ResponseEntity<Object> cercaProductes(@RequestParam String nom) {
        return ResponseEntity.ok(productService.findByName(nom));
    }

    // Modificar el preu d’un producte
    @PutMapping("/ModificarPreu")
    public ResponseEntity<String> modificarPreu(@RequestParam Long id, @RequestParam double nouPreu) {
        ProductDTO product = (ProductDTO) productService.findById(id).orElse(null);
        if (product != null) {
            product.setPriceProduct((float) nouPreu);
            productService.save(product);
            return ResponseEntity.ok("Preu modificat correctament.");
        }
        return ResponseEntity.badRequest().body("Producte no trobat.");
    }

    // Nova Categoria
    @PostMapping("/inserirCategoria")
    public ResponseEntity<String> inserirCategoria(@RequestBody CategoriaDTO categoriaDTO) {
        categoriaService.save(categoriaDTO);
        return ResponseEntity.ok("Categoria inserida correctament.");
    }

    // Llistat totes les categories
    @GetMapping("/LlistarCategories")
    public ResponseEntity<Object> llistarCategories() {
        return ResponseEntity.ok(categoriaService.findAll());
    }

    // Nova Subcategoria
    @PostMapping("/inserirSubcategoria")
    public ResponseEntity<String> inserirSubcategoria(@RequestBody SubcategoriaDTO subcategoriaDTO) {
        subCategoriaService.save(subcategoriaDTO);
        return ResponseEntity.ok("Subcategoria inserida correctament.");
    }

    // Llistat totes les subcategories
    @GetMapping("/LlistarSubcategories")
    public ResponseEntity<Set<SubcategoriaDTO>> llistarSubcategories() {
        return ResponseEntity.ok(subCategoriaService.findAll());
    }

    //Cerca una descripcio per id de producte
    @GetMapping("/CercaDescripcioProducte")
    public ResponseEntity<String> cercaDescripcioProducte(@RequestParam Long id) {
        String descripcio = productService.findDescripcionById(id);
        if (descripcio != null) {
            return ResponseEntity.ok(descripcio);
        }
        return ResponseEntity.badRequest().body("Producte no trobat.");
    }

    //Cerca una descripcio per id de categoria
    @GetMapping("/CercaDescripcioCategoria")
    public ResponseEntity<String> cercaDescripcioCategoria(@RequestParam Long id) {
        String descripcio = categoriaService.findDescripcionById(id);
        if (descripcio != null) {
            return ResponseEntity.ok(descripcio);
        }
        return ResponseEntity.badRequest().body("Categoria no trobada.");
    }

    //Cerca una descripcio per id de subcategoria
    @GetMapping("/CercaDescripcioSubcategoria")
    public ResponseEntity<String> cercaDescripcioSubcategoria(@RequestParam Long id) {
        String descripcio = subCategoriaService.findDescripcionById(id);
        if (descripcio != null) {
            return ResponseEntity.ok(descripcio);
        }
        return ResponseEntity.badRequest().body("Subcategoria no trobada.");
    }

}

