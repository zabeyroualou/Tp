//package com.example.testProject.controller;
//
//import com.example.testProject.entity.Produit;
//import com.example.testProject.service.ProduitServices;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class ProduitController {
//    private final ProduitServices produitServices;
//
//    public ProduitController(ProduitServices produitServices) {
//        super();
//        this.produitServices = produitServices;
//    }
//
//    //handler methode to handle list Produits and return mode and view
//    @GetMapping("/produits")
//    public String listProduits(Model model){
//        model.addAttribute("produits", ProduitServices.getAllProduit());
//        return "Produits";
//    }
//
//    @GetMapping("/Produits/new")
//    public String createProduitForm(Model model) {
//        Produit produit = new Produit();
//        model.addAttribute("Produit", produit);
//        return "create_Produit";
//    }
//
//    @PostMapping("/Produits")
//    public String saveProduit(@ModelAttribute("produit") Produit produit) {
//        produitServices.saveProduit(Produit);
//        return "redirect:/Produits";
//    }
//    @GetMapping("/Produits/edit/{id}")
//    public String editProduit(@PathVariable Long id, Model model) {
//        model.addAttribute("Produit", ProduitServices.getProduitById(id));
//        return "edit_Produit";
//    }
//    @PostMapping("/Produits/{id}")
//    public String updateProduit(@PathVariable Long id, @ModelAttribute("Produit") Produit Produit, Model model) {
//
//        //get Produit from database by id
//        Produit existingProduit = ProduitServices.getProduitById(id);
//        existingProduit.setId(id);
//        existingProduit.setFirstName(Produit.getFirstName());
//        existingProduit.setLastName(Produit.getLastName());
//        existingProduit.setEmail(Produit.getEmail());
//
//        //save update Produit object
//        ProduitServices.updateProduit(existingProduit);
//        return "redirect:/Produits";
//    }
//
//    //handler method to handle delete Produit request
//    @GetMapping("/Produits/{id}")
//    public String deleteProduit(@PathVariable Long id) {
//        ProduitServices.deleteProduitById(id);
//        return "redirect:/Produits";
//    }
//}
