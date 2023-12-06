package com.company;

public class TasteTester {
    public static void main(String[] args){
        Cake cake = new Cake("Vanilla");
        BirthdayCake birthdayCake = new BirthdayCake();
        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTiers(4);
        System.out.println("This cake's flavor is " + cake.getFlavor());
        System.out.println("This cake's flavor is " + birthdayCake.getFlavor());
        System.out.println("This cake's flavor is " + weddingCake.getFlavor());
        System.out.println("The wedding cake has " + weddingCake.getTiers() + " tiers");

    }
}
