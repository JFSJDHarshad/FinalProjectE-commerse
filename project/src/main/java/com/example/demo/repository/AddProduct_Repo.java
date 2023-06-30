package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddProduct;

@Repository
public interface AddProduct_Repo extends JpaRepository<AddProduct,Integer>{
    
}
