package com.company;

public class HealthyBurguer extends Hamburger {


    public HealthyBurguer(String breadRollType, String meat, double burguerPrice) {
        super("brown", "chicken", burguerPrice);

    }

    @Override
    public double addingExtrasCalculation(int numOnAdd) {
        if (numOnAdd < 0 || numOnAdd > 6) {
            return super.addingExtrasCalculation(numOnAdd);
        }
        return -1;
    }
}
