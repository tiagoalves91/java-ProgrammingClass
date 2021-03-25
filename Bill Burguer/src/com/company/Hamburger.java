package com.company;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;

    private String addTomato;
    private double priceTomato;

    private String addOnions;
    private double priceAddOnions;

    private String addMostarda;
    private double priceMostarda;

    private String addPeppers;
    private double pricePeppers;


    private double burguerPrice;
    private double addOnPrice;

    public Hamburger(String name,String breadRollType, String meat,double burguerPrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;

        this.burguerPrice = 10;
        this.addOnPrice = addOnPrice;
    }

    public void addTomato(String name, double price) {
        this.addTomato = name;
        this.priceTomato = 1;
}

    public void addOnios(String name, double price) {
        this.addOnions = name;
        this.priceAddOnions = 0.5;
    }

    public void addPeppers(String name, double price) {
        this.addPeppers = name;
        this.pricePeppers = 1.4;
    }

    public void addMostarda(String name, double price) {
        this.addMostarda = name;
        this.priceMostarda = 1.3;
    }


}
