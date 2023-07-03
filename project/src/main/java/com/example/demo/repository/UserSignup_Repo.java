package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserSignup;
@Repository
public interface UserSignup_Repo extends JpaRepository<UserSignup,String>{

    UserSignup findByEmail(String email);

    UserSignup findByPassword(String password);

    UserSignup findByEmailAndPassword(String email, String password);
    
}
