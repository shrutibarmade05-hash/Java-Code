package com.am;

public class MainAccount {
public static void main(String args[]) {
	BankAccount b = new CurrentAccount();
	System.out.println("*Current Account*");
	b.calculateIntrest();
	b.displayBalance();
	
	System.out.println("---------------------------------------");
	
	System.out.println("*Saving Account*");
	b = new SavingAccount();
	b.calculateIntrest();
	b.displayBalance();
}
}
