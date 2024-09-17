package com.example.testProject.repository;

import com.example.testProject.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategorieRepository extends JpaRepository<Categorie, String> {

}
