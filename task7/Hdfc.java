package com.task7;

public class Hdfc implements Bank{
	double balance = 5000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("HDFC: Deposited " + amount);
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("HDFC: Withdrawn " + amount);
        } else {
            System.out.println("HDFC: Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("HDFC Balance = " + balance);
    }
}
