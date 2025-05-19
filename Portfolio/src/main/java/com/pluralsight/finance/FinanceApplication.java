package com.pluralsight.finance;

public class FinanceApplication {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        BankAccount account2 = new BankAccount("Gary","456", 1500);

        // try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);

        System.out.println(account1.getBalance());
    }
}
