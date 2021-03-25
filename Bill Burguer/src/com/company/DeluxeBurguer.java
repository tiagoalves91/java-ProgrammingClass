package com.company;

public class DeluxeBurguer extends Hamburger{

    private String Chips;
    private String Drinks;

    public DeluxeBurguer(String breadRollType, String meat, double burguerPrice, String chips, String drinks) {
        super(breadRollType, meat, burguerPrice);
        Chips = chips;
        Drinks = drinks;
    }

    @Override
    public double addingExtrasCalculation(int numOnAdd) {
        if(numOnAdd>1) {
            System.out.println("not allowed to add ");
            return -1;
        }
        return super.addingExtrasCalculation(numOnAdd);
    }
}
