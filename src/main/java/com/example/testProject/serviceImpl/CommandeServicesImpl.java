//package com.example.testProject.serviceImpl;
//
//import com.example.testProject.entity.Commande;
//import com.example.testProject.repository.CommandeRepository;
//import com.example.testProject.service.CommandeServices;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CommandeServicesImpl implements CommandeServices {
//
//    private final CommandeRepository commandeRepository;
//
//    public CommandeServicesImpl(CommandeRepository commandeRepository) {
//        super();
//        this.commandeRepository = commandeRepository;
//    }
//
//    @Override
//    public List<Commande> getAllCommande(){return commandeRepository.findAll();}
//    @Override
//    public Commande saveCommand(Commande commande){return commandeRepository.save(commande);}
//    @Override
//    public Commande getCommandeById(Long id){return commandeRepository.findById(id).get();}
//    @Override
//    public Commande updateCommande(Commande commande){return commandeRepository.save(commande);}
//    @Override
//    public void deleteCommandeById(Long id){commandeRepository.deleteById(id);}
//
//}