package com.example.testProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/accueil")
    public String findStudents(Model model) {
        return "index";
    }
}
