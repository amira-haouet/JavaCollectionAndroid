package com.example.productmanagerandroid;

public class Product {

    Integer Id;   String Name;
    Integer Quantity;


    public Product(Integer id,String name,Integer quantity) {
        Id = id;
        Name=name;
        Quantity=quantity;

    }

    public Product() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }
}