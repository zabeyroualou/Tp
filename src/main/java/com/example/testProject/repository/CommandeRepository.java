package com.example.testProject.repository;


import com.example.testProject.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long>{
}