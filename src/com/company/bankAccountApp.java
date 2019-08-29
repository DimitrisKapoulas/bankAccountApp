package com.company;

import java.io.IOException;
import java.util.List;

public class bankAccountApp {

    public static void main(String[] args) {
        /*
        Savings sav1 = new Savings("Tom Morello", "123456789", 1500);
        Checking chk1 = new Checking("Nelson Oliveira", "987456321", 2500);
        sav1.showInfo();
        chk1.showInfo();
        sav1.compound();
        **/

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
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }
    }
}
