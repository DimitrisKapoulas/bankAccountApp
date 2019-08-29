package com.company;

public class Savings extends Account {
    // List properties specific to the Savings Account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize settings for the Savings properties

    public Savings(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate(){
        rate = getBaseRate() - 0.25;
    }

    public void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random()*Math.pow(10, 3));
        safetyDepositBoxKey = (int)(Math.random()*Math.pow(10, 4));
    }

    // List any methods specific to savings account
    public void showInfo(){
        System.out.println("Account type: Savings");
        super.showInfo();
        System.out.println("Your Savings account features"+
        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
        "\n Safety Deposit Box key: " + safetyDepositBoxKey);
    }
}
