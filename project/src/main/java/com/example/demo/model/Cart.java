package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
  
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  
  private String productId;
   private String product_name;
    private String brand_name;
    private String model_no;
    private Integer price;
    private String collor;
    private String image_url;
    
   
   
    public Cart(Integer productId2, String productName, String brandName, String modelNo, Integer price2, String color,
            String image) {
    }
    // public Cart(Long id, String productId, String product_name, String brand_name, String model_no, Integer price,
    //         String collor, String image_url) {
    //     this.id = id;
    //     this.productId = productId;
    //     this.product_name = product_name;
    //     this.brand_name = brand_name;
    //     this.model_no = model_no;
    //     this.price = price;
    //     this.collor = collor;
    //     this.image_url = image_url;
    // }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public String getBrand_name() {
        return brand_name;
    }
    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }
    public String getModel_no() {
        return model_no;
    }
    public void setModel_no(String model_no) {
        this.model_no = model_no;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getCollor() {
        return collor;
    }
    public void setCollor(String collor) {
        this.collor = collor;
    }
    public String getImage_url() {
        return image_url;
    }
    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

  
  // constructors, getters, and setters
}

