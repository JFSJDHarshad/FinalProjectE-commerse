package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.UserSignup;
import com.example.demo.repository.UserSignup_Repo;

@Controller
public class SignupController {

    @Autowired
    private UserSignup_Repo userRepo;
    
    @GetMapping("/signup")
    public String signup(){

        return "signup";
    }

    @PostMapping("/signup")
    public String signupDetails(UserSignup user){
        userRepo.save(user);
        return "login";
    }
}
