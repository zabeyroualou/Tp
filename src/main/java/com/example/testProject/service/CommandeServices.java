package com.example.testProject.service;

import com.example.testProject.entity.Commande;
import java.util.List;

public interface CommandeServices {

    List<Commande> getAllCommands();
    Commande saveCommand(Commande commande);
    Commande getCommandeById(Long id);
    Commande updateCommande(Commande commande);
    void deleteCommandeById(Long id);

}