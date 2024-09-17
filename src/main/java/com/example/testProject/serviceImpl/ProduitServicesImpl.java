//package com.example.testProjet.serviceImpl;
//
//import com.example.testProject.entity.Produit;
//import com.example.testProject.repository.ProduitRepository;
//import com.example.testProject.service.ProduitServices;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProduitServicesImpl implements ProduitServices {
//
//    private final ProduitRepository ProduitRepository;
//    public ProduitServicesImpl(ProduitRepository ProduitRepository) {
//        super();
//        this.ProduitRepository = ProduitRepository;
//    }
//
//    @Override
//    public List<Produit> getAllProduit() {
//        return ProduitRepository.findAll();
//    }
//
//    @Override
//    public Produit saveProduit(Produit Produit) {
//        return ProduitRepository.save(Produit);
//    }
//
//    @Override
//    public Produit getProduitById(Long id) {
//        return ProduitRepository.findById(id).get();
//    }
//
//    @Override
//    public Produit updateProduit(Produit Produit) {
//        return ProduitRepository.save(Produit);
//    }
//
//    @Override
//    public void deleteProduitById(Long id) {
//        ProduitRepository.deleteById(id);
//    }
//
//}
