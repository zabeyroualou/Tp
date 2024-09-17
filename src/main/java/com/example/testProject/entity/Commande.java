package com.example.testProject.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table (name = "commandes")

public class Commande {

    private Long id;
    @Column(name = "quantiteCommande", nullable = false)
    private Integer quantiteCommande;
    private Date dateCommande;


    public Commande(Integer quantiteCommande, Date dateCommande) {
        super();
        this.quantiteCommande = quantiteCommande;
        this.dateCommande = dateCommande;
    }

    public static Commande createCommande(Integer quantiteCommande, Date dateCommande) {
        return new Commande(quantiteCommande,dateCommande);
    }

    /**
     * get field @Id
     @Generated(strategy = GenerationType.IDENTITY)

      *
      * @return id @Id
     @Generated(strategy = GenerationType.IDENTITY)

     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field @Id
     @Generated(strategy = GenerationType.IDENTITY)

      *
      * @param id @Id
     @Generated(strategy = GenerationType.IDENTITY)

     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field @Column(name = "quantiteCommande", nullable = false)
     *
     * @return quantiteCommande @Column(name = "quantiteCommande", nullable = false)

     */
    public Integer getQuantiteCommande() {
        return this.quantiteCommande;
    }

    /**
     * set field @Column(name = "quantiteCommande", nullable = false)
     *
     * @param quantiteCommande @Column(name = "quantiteCommande", nullable = false)

     */
    public void setQuantiteCommande(Integer quantiteCommande) {
        this.quantiteCommande = quantiteCommande;
    }

    /**
     * get field
     *
     * @return dateCommande
     */
    public Date getDateCommande() {
        return this.dateCommande;
    }

    /**
     * set field
     *
     * @param dateCommande
     */
    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }
}