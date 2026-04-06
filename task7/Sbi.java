package com.task7;

public class Sbi  implements Bank {
	 double balance = 10000;

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("SBI: Deposited " + amount);
	    }

	    public void withdraw(double amount) {
	        if(amount <= balance) {
	            balance -= amount;
	            System.out.println("SBI: Withdrawn " + amount);
	        } else {
	            System.out.println("SBI: Insufficient balance");
	        }
	    }

	    public void checkBalance() {
	        System.out.println("SBI Balance = " + balance);
	    }
}
