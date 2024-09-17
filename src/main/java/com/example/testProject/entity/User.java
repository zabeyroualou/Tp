package com.example.testProject.entity;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table (name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 20)
    @Column(name = "nom", unique = true)
    private String nom;

    @NotBlank
    @Size(max = 50)
    @Email
    @Column(name = "email", unique = true)
    private String email;

    @NotBlank
    @Size(max = 120)
    private String password;

    public User() {
    }

    public User(String nom, String email, String password) {
        super();
        this.nom = nom;
        this.email = email;
        this.password = password;
    }

    public static User createUser(String nom, String email, String password) {
        return new User(nom, email, password);
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
     * get field @Column(name = "nom", nullable = false, unique = true)
     *
     * @return nom @Column(name = "nom", nullable = false, unique = true)

     */
    public String getNom() {
        return this.nom;
    }

    /**
     * set field @Column(name = "nom", nullable = false, unique = true)
     *
     * @param nom @Column(name = "nom", nullable = false, unique = true)

     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * get field @Column(name = "email", nullable = false, unique = true)
     *
     * @return email @Column(name = "email", nullable = false, unique = true)

     */
    public String getEmail() {
        return this.email;
    }

    /**
     * set field @Column(name = "email", nullable = false, unique = true)
     *
     * @param email @Column(name = "email", nullable = false, unique = true)

     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get field @Column(name = "password", nullable = false)
     *
     * @return password @Column(name = "password", nullable = false)

     */
    public String getPassword() {
        return this.password;
    }

    /**
     * set field @Column(name = "password", nullable = false)
     *
     * @param password @Column(name = "password", nullable = false)

     */
    public void setPassword(String password) {
        this.password = password;
    }
}