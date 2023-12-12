package com.khvlifv.testapi.service;

import com.khvlifv.testapi.model.produit;
import com.khvlifv.testapi.repository.produitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProduitServiceImplement implements ProduitService{

    final produitRepository produitRepo;
    @Override
    public produit creer(produit prod) {
        return produitRepo.save(prod);
    }

    @Override
    public List<produit> lire() {
        return produitRepo.findAll();
    }

    @Override
    public produit modifier(Long id, produit prod) {
        return produitRepo.findById(id)
                .map(p -> {
                    p.setPrix(prod.getPrix());
                    p.setNom(prod.getNom());
                    p.setDescription(prod.getDescription());
                    return produitRepo.save(prod);
                }).orElseThrow(() -> new RuntimeException("produit non trouve !"));
    }

    @Override
    public String supprimer(Long id) {
        produitRepo.deleteById(id);
        return "produit supprimé";
    }
}
