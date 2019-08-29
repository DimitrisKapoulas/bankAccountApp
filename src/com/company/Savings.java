package com.company;

public class Savings extends Account {
    // List properties specific to the Savings Account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the Savings properties

    public Savings(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "1" + accountNumber;

    }


    // List any methods specific to savings account
    public void showInfo(){
        super.showInfo();
        System.out.println("Account type: Savings");
    }
}
