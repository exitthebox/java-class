package com.kimmitt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount mine = new BankAccount();

        //call overloaded constructor here
        //BankAccount yours = new BankAccount(12345, 10000, "You", "you@you.com", "555-1212");


        double amount = 500;

        mine.setBalance(1000);

        double balance = mine.getBalance();
        System.out.println("balance: "+ balance);

        balance = mine.deposit(amount);
        System.out.println(balance);

        balance = mine.withdrawl(100);
        System.out.println(balance);
    }
}
