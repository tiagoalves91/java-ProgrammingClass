package com.company;

public class Main {

    public static void main(String[] args) {
    Bank bank = new Bank("Nation Bank");

    bank.addBranch("Adelaide");

    bank.addCostumer("Adelaide","Tiago",50.05);
    bank.addCostumer("Adelaide","Mike",10.05);
    bank.addCostumer("Adelaide","Marta",350.05);

    bank.addCustomerTransaction("Adelaide", "Tiago" ,44.25);
    bank.addCustomerTransaction("Adelaide", "Telles" ,44.25);
    bank.addCustomerTransaction("Adelaide", "Jacinto" ,44.25);

    bank.listCustomer("Adelaide",true);
    }
}
