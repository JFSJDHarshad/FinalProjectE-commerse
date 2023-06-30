package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.AddProduct;
// import com.example.demo.model.UserSignup;
import com.example.demo.repository.AddProduct_Repo;
// import com.example.demo.repository.UserSignup_Repo;

@Controller
// @RequestMapping("/products")
public class AddProductController {
    @Autowired
    private AddProduct_Repo userRepo;
    
    // @GetMapping("/productlist")
    // public String addProduct(){

    //     return "shop";
    // }

    @RequestMapping("/shop")
    public String shop(AddProduct addedProduct,Model model){
        userRepo.save(addedProduct);
        List<AddProduct> products=userRepo.findAll();
        model.addAttribute("products", products);
        return "shop";
    }

    // @GetMapping("/delete/{product_id}")
    // public String deleteProduct(@PathVariable("product_id") Integer productId) {
    //     userRepo.deleteById(productId);
    //     return "shop";
    // }
}
