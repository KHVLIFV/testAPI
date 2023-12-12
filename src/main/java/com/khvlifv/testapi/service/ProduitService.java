package com.khvlifv.testapi.service;

import com.khvlifv.testapi.model.produit;

import java.util.List;

public interface ProduitService {

    produit creer(produit prod);
    List<produit> lire();
    produit modifier(Long id, produit prod);
    String supprimer(Long id);
}
