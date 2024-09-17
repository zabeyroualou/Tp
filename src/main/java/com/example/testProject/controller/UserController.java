package com.example.testProject.controller;

import com.example.testProject.entity.User;
import com.example.testProject.service.UserServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
    private final UserServices userServices;

    public UserController(UserServices userServices) {
        super();
        this.userServices = userServices;
    }

//    @GetMapping("/login")
//    public String login(HttpServletRequest request, HttpSession session) {
//        session.setAttribute("error", getErrorMessage(request, "SPRING_SECURITY_LAST_EXCEPTION"));
//        return "loginForm";
//    }


//    handler methode to handle list Users and return mode and view
    @GetMapping("/Users")
    public String listUsers(Model model){
        model.addAttribute("users", userServices.getAllUser());
        return "users";
    }
//    @GetMapping("/users/new")
//    public String createUserForm(Model model) {
//        User user = new User();
//        model.addAttribute("User", user);
//        return "create_User";
//    }

    @PostMapping("/users")
    public String saveUser(@ModelAttribute("user") User user) {
        userServices.saveUser(user);
        return "redirect:/users";
    }
    @GetMapping("/users/edit/{id}")
    public String editUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userServices.getUserById(id));
        return "edit_User";
    }
    @PostMapping("/users/{id}")
    public String updateUser(@PathVariable Long id, @ModelAttribute("user") User user, Model model) {

        //get User from database by id
        User existingUser = userServices.getUserById(id);
        existingUser.setId(id);
        existingUser.setNom(user.getNom());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());

        //save update User object
        userServices.updateUser(existingUser);
        return "redirect:/users";
    }

    //handler method to handle delete User request
    @GetMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        userServices.deleteUserById(id);
        return "redirect:/users";
    }
}
