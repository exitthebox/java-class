package com.kimmitt;

/**
 * Created by Patrick on 1/21/2017.
 */
public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    //constructor of object
    public BankAccount(){
        System.out.println("empyt constructor called");
    }

    //setter constructor. basically we don't need the setters after this if we do this.
    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

//    public void setAccountNumber(int accountNumber){
//        this.accountNumber = accountNumber;
//    }
//
    public void setBalance(double balance){
        this.balance = balance;
    }
//
//    public void setCustomerName(String customerName){
//        this.customerName = customerName;
//    }
//
//    public void setEmail(String email){
//        this.email = email;
//    }
//
//    public void setPhoneNumber(String phoneNumber){
//        this.phoneNumber = phoneNumber;
//    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public double deposit(double amount){
        this.balance += amount;
        return this.balance;
    }

    public double withdrawl(double amount){
        if((this.balance - amount) > 0 ) {
            this.balance -= amount;
            return this.balance;
        } else {
            return amount;
        }
    }
}
