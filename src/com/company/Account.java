package com.company;

public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts
    String name;
    String sSN;
    double balance;
    String accountNumber;
    double rate;

    // Constructor to set base properties and initialize the account

    public Account(String name, String sSn, double initDeposit) {
        this.name = name;
        this.sSN = sSn;
        balance = initDeposit + 100;
        System.out.println("Name: " + name + " SSN: " + sSn + " BALANCE: " + balance);

    }
    // List common methods
}
