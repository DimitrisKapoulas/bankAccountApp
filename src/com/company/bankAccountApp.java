package com.company;

public class bankAccountApp {

    public static void main(String[] args) {

        Savings sav1 = new Savings("Tom Morello", "123456789", 1500);
        Checking chk1 = new Checking("Nelson Oliveira", "987456321", 2500);
        sav1.showInfo();
        chk1.showInfo();
        sav1.deposit(5000);
        chk1.withdraw(4020);
        sav1.transfer("Brokerage", 500);
        // Read a CSV file, then create new accounts based on that date
    }
}
