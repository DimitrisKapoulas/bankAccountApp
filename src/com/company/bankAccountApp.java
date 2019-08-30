package com.company;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class bankAccountApp {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        // Read a CSV file, then create new accounts based on that date
        String file = "/home/mitsos/IdeaProjects/bankAccountApp/src/utilities/NewBankAccounts.csv";
        List<String[]> newAccountHolders = null;

        try {
            newAccountHolders = utilities.CSV.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String[] accountHolder: newAccountHolders
             ) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String  accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, sSN, initDeposit));
            }else if (accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
            }else{
                System.out.println("Error Reading Account Type");
            }
        }

        for (Account acc: accounts
             ) {
            System.out.println("**************");
            acc.showInfo();
        }
    }
}
