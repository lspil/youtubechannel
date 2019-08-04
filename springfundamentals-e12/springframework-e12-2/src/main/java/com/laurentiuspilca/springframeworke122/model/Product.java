package com.laurentiuspilca.springframeworke122.model;


import org.springframework.data.annotation.Id;

public class Product {

    @Id
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
