package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.UserSignup;
import com.example.demo.repository.UserSignup_Repo;

@Controller
public class LoginController {

    @Autowired
    private UserSignup_Repo signupRepo;

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/log_in")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        UserSignup user = signupRepo.findByEmailAndPassword(email, password);

        if (user != null) {
            return "index";
        } else {
           
            return "login";
        }
    }
}

