package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepo;

@Controller
public class CartController {
  
  @Autowired
  private CartRepo cartRepo;


  @PostMapping("/add-to-cart")
  public String addToCart(@RequestParam("productId") Long productId,
                          @RequestParam("product_name") String productName,
                          @RequestParam("brand_name") String brandName,
                          @RequestParam("model_no") String modelNo,
                          @RequestParam("price") double price,
                          @RequestParam("collor") String color,
                          @RequestParam("image_url") String image) {
    
    // Create a new cart item entity
    Cart cartItem = new Cart(productId, productName, brandName, modelNo, price, color,image);
    
    // Save the cart item to the database
    cartRepo.save(cartItem);
    
    return "redirect:/myCart.html"; // Redirect to the cart page
  }
}
