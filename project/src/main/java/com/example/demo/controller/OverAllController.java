package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OverAllController {
    @RequestMapping("/index")
    public String index()
    {
        return "index" ;
    }

    @RequestMapping("/login")
    public String loginPage()
    {
        return "login" ;
    }
    
    // @RequestMapping("/shop")
    // public String shopPage()
    // {
    //     return "shop" ;
    // }

    @RequestMapping("/brand")
    public String brandPage()
    {
        return "brand" ;
    }

    @RequestMapping("/my-info")
    public String infoPage()
    {
        return "my-info" ;
    }

    @RequestMapping("/ourteam")
    public String teamPage()
    {
        return "ourteam" ;
    }
    //  @RequestMapping("/addProduct")
    // public String teamPage()
    // {
    //     return "shop" ;
    // }

    @RequestMapping("/admin")
    public String adminPage()
    {
        return "adminLogin" ;
    }

}
