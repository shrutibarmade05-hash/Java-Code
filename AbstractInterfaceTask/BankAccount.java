package com.AbstractInterfaceTask;

public abstract  class BankAccount {
/*1. Bank System (Abstract Class)
Create an abstract class BankAccount with:
abstract method calculateInterest()
concrete method displayBalance()
Create child classes:
SavingAccount
CurrentAccount
Implement different interest logic.*/
	
	public  abstract void calculateIntrest();
	
	public void displayBalance() {
		System.out.println("account balance is 40000 ");
	}
}
