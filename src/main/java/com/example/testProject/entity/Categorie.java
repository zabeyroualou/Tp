package com.example.testProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categorie {

//    @id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom", nullable = false)
    private String nom;

    public Categorie(String nom){
        super();
        this.nom = nom;
    }

    public Categorie createCategorie(String nom){
        return new Categorie(nom);
    }


    /**
     * get field @id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

      *
      * @return id @id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field @id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

      *
      * @param id @id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field @Column(name = "nom", nullable = false)
     *
     * @return nom @Column(name = "nom", nullable = false)

     */
    public String getNom() {
        return this.nom;
    }

    /**
     * set field @Column(name = "nom", nullable = false)
     *
     * @param nom @Column(name = "nom", nullable = false)

     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}