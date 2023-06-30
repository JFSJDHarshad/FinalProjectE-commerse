package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AddProduct;

public interface ProductsRepo extends JpaRepository<AddProduct,Integer>{
    
}
