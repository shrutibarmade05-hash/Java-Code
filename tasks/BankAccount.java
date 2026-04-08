package com.tasks;

public abstract class BankAccount {
	
/*	 Banking System
	 Create an abstract class BankAccount with:
	 variables: accountNumber, balance
	 abstract method: calculateInterest()
	 concrete method: deposit()
	 Create subclasses:
	 SavingsAccount
	 CurrentAccount------------------------------------------------------------------------
	 
*/
	int accountNumber;
	double balance;
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("deposit = " +amount+balance);
	}
		public abstract void calculateInterest();
	
}
