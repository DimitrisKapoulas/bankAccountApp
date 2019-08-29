package com.company;

public class Checking extends Account {
    // List properties specific to a Checking Account
    private int debitCardNumber;
    private int debitCardPIN;

    // Constructor to initialize checking account properties

    public Checking(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }

    @Override
    public void setRate(){
        rate = getBaseRate()*0.15;
    }
    private void setDebitCard(){
        debitCardNumber = (int)(Math.random()*Math.pow(10, 12));
        debitCardPIN = (int)(Math.random()*Math.pow(10, 4));
    }
    // List any methods specific to the checking account
    public void showInfo(){
        super.showInfo();
        System.out.println("Account type: Checking");
        System.out.println("Your Checking account features"+
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card PIN: " + debitCardPIN);
    }
}
