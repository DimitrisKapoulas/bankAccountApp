package com.company;

public class Checking extends Account {
    // List properties specific to a Checking Account
    int debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize checking account properties

    public Checking(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "2" + accountNumber;

    }
    // List any methods specific to the checking account
    public void showInfo(){
        super.showInfo();
        System.out.println("Account type: Checking");
    }
}
