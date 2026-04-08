package com.tasks;

public class Mainbank {
public static void main(String args[]) {
   BankAccount b = new SavingsAccount();
   b.calculateInterest();
   b.deposit(878);
   
   b = new CurrentAccounts();
   b.calculateInterest();
   b.deposit(8799);
   
}
}
