package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(
    name = "product_list"
)
public class Products {

   @Id
    @SequenceGenerator(
        name = "id_sequence",
        sequenceName = "id_sequence",
        allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "id_sequence")
    @Column(
        name="id"
    )
    private Integer productId;
   
    public Integer getProductId() {
    return productId;
}
public void setProductId(Integer productId) {
    this.productId = productId;
}
    private String product_name;
    private String brand_name;
    private String model_no;
    private Integer price;
    private String collor;
    private String image_url;

    

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

}
