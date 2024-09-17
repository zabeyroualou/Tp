package com.example.testProject.service;

import com.example.testProject.entity.Categorie;

import java.util.List;

public interface CategorieServices {

    List<Categorie> getAllCategorie();
    Categorie saveCategorie(Categorie Categorie);
    Categorie getCategorieByCode(String code);
    Categorie updateCategorie(Categorie Categorie);
    void deleteCategorieById(String code);
}
