package com.example.testProject.entity;


import jakarta.persistence.*;

@Entity
@Table (name = "produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "designation", nullable = false)
    private String designation;
    @Column(name = "description")
    private String description;
    @Column(name = "prix", nullable = false)
    private Double prix;
    @Column(name = "quantite", nullable = false)
    private Integer quantite;
    private String categorie;


    public Produit(String designation, String description, Double prix, Integer quantite, String categorie) {
        super();
        this.designation = designation;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    public static Produit createProduit(String designation, String description, Double prix, Integer quantite, String categorie) {
        return new Produit(designation,description,prix,quantite,categorie);
    }


    /**
     * get field @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

      *
      * @return id @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

      *
      * @param id @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field @Column(name = "designation", nullable = false)
     *
     * @return designation @Column(name = "designation", nullable = false)

     */
    public String getDesignation() {
        return this.designation;
    }

    /**
     * set field @Column(name = "designation", nullable = false)
     *
     * @param designation @Column(name = "designation", nullable = false)

     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * get field @Column(name = "description")
     *
     * @return description @Column(name = "description")

     */
    public String getDescription() {
        return this.description;
    }

    /**
     * set field @Column(name = "description")
     *
     * @param description @Column(name = "description")

     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get field @Column(name = "prix", nullable = false)
     *
     * @return prix @Column(name = "prix", nullable = false)

     */
    public Double getPrix() {
        return this.prix;
    }

    /**
     * set field @Column(name = "prix", nullable = false)
     *
     * @param prix @Column(name = "prix", nullable = false)

     */
    public void setPrix(Double prix) {
        this.prix = prix;
    }

    /**
     * get field @Column(name = "quantite", nullable = false)
     *
     * @return quantite @Column(name = "quantite", nullable = false)

     */
    public Integer getQuantite() {
        return this.quantite;
    }

    /**
     * set field @Column(name = "quantite", nullable = false)
     *
     * @param quantite @Column(name = "quantite", nullable = false)

     */
    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    /**
     * get field
     *
     * @return categorie
     */
    public String getCategorie() {
        return this.categorie;
    }

    /**
     * set field
     *
     * @param categorie
     */
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}