package com.khvlifv.testapi.repository;

import com.khvlifv.testapi.model.produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produitRepository extends JpaRepository<produit, Long> {

}
