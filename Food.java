package com.example.s528131.myapplication;

/**
 * Created by S528131 on 3/1/2017.
 */

public class Food {
    private String name;
    private double price;

    public Food() {
    }

    public Food(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
