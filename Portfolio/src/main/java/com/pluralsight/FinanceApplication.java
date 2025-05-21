package com.pluralsight;

import com.pluralsight.finance.*;

public class FinanceApplication {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        BankAccount account2 = new BankAccount("Gary","456", 1500);

        // try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);

        System.out.println(account1.getBalance());

        Portfolio test = new Portfolio("Jack", "test");
        test.add(new Gold(16));
        test.add(new Jewelry("Ring", 3));
        test.add(new House(1970, 2350, 3));
        test.add(account1);
        test.add(new CreditCard("Jack", "1234", 1200));

        System.out.println("Total Net worth: " + test.getValue());
        System.out.println("Most valuable asset: " + test.getMostValuable());
        System.out.println("Least valuable asset: " + test.getLeastValuable());
    }
}
