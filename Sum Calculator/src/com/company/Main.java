package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bank = new BankAccount("Tiago",13,15000);
        bank.deposit(300);

        bank.withdraw(400);
        bank.withdraw(200);

        VipCustomer tiagoVip = new VipCustomer("Tiago",5000,"tiago.pt");
        VipCustomer maxVip = new VipCustomer("Max", "max.pt");
        VipCustomer defaultVip = new VipCustomer();






    }
}
