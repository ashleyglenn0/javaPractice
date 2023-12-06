package com.company;

public class Cake {
    private String flavor;
    private double price;

    public Cake(String flavor){
        this.flavor = flavor;
        this.price = 25.00;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
