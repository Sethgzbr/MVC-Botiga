package com.example.botiga.Controller;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.botiga.DTO.ProductDTO;
import com.example.botiga.Model.Product;
import com.example.botiga.Service.ProductServiceImpl;


@Controller
public class WebController {
 
    @Autowired
    private ProductServiceImpl productService;
 
    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index";
    }
 
    @RequestMapping(value = "/catalog")
    public String catalog(Model model) {
        Set<ProductDTO> products = productService.findAll();
        
        model.addAttribute("products", products);
        return "catalog";
    }

    @GetMapping("/cercaid")
    public String inputCerca(Model model) {

        Product llibre = new Product();
        llibre.setidProducte(0);
        model.addAttribute("llibreErr", true);
        model.addAttribute("message", "");
        model.addAttribute("llibre", llibre);

        return "cercaid";

    }
    
    @PostMapping("/cercaid")
    public String cercaId(@RequestParam(name = "idProduct", required = false) String idProducte, 
                          Model model) {
        
        Long idLlib = (long) 0;
        String message = "";
        boolean llibreErr = false;

        try {
            idLlib = Long.parseLong(idProducte);
            Optional<ProductDTO> llibre = productService.findById(idLlib);
            if(llibre !=null) {
                model.addAttribute("Producte", llibre);
            } else {
                message = "No hi ha cap producte amb aquesta id";
                llibreErr = true;
            }

        } catch (Exception e) {
            message = "La id de llibre ha de ser un nombre enter";
            llibreErr = true;
        } 
        
        model.addAttribute("message", message);
        model.addAttribute("llibreErr",llibreErr);

        return "cercaid";

    }
    /* 
    @PostMapping("/inserir")
    public String inserir(@ModelAttribute("users") Usuaris users, Llibre llibre, Model model) {

        repoll.InsertaLlibre(llibre);//La insercio acaba aqui

        ArrayList<Llibre> llibres = repoll.getAllLlibres();

        model.addAttribute("llibres", llibres);
        
        return "consulta";
    
    }*/

}
