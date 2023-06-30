package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.AdminLogin;
import com.example.demo.repository.AdminLogin_Repo;

@Controller
public class AdminLoginController {

    @Autowired
    private AdminLogin_Repo adminLoginRepo;

    @GetMapping("/adminlogin")
    public String adminLogin() {
        
        return "adminLogin";
    }

    @PostMapping("/admin_login")
    public String adminLoginDetails(@RequestParam("admin") String admin, @RequestParam("password") String password, Model model) {
        AdminLogin adminn = adminLoginRepo.findByAdminAndPassword(admin,password);

        if (adminn != null) {
            return "addProduct";
        } else {
            
            return "adminLogin";
        }
    }

}
