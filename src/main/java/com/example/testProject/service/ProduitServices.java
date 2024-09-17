package com.example.testProject.service;

import com.example.testProject.entity.Produit;

import java.util.List;

public interface ProduitServices {

    List<Produit> getAllProduit();
    Produit saveProduit(Produit produit);
    Produit getProduitById(Long id);
    Produit updateProduit(Produit produit);
    void deleteProduitById(Long id);

}