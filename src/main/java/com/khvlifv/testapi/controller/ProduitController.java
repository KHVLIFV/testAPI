package com.khvlifv.testapi.controller;

import com.khvlifv.testapi.model.produit;
import com.khvlifv.testapi.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {

    final ProduitService produitService;

    @PostMapping( "/create")
    public produit create(@RequestBody produit prod) {
        return produitService.creer(prod);
    }

    @GetMapping("/read")
    public List<produit> read() {
        return produitService.lire();
    }

    @PutMapping("/update/{id}")
    public produit update(@PathVariable Long id, @RequestBody produit prod) {
        return produitService.modifier(id, prod );
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return produitService.supprimer(id);
    }

}
