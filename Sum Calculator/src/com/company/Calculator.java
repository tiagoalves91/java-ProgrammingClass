package com.company;

public class Calculator {

    Floor floor = new Floor(1500,1000);

    Carpet carpet = new Carpet(8);

public double getTotalCost() {

double totalArea = floor.getArea();
double price = carpet.getCost() * totalArea;

return price;
}

}
