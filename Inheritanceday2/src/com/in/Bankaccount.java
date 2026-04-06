package com.in;

public class Bankaccount {
	/*2> Base class: BankAccount

attributes: account_holder, balance
methods: deposit(), withdraw()
Derived class: SavingsAccount
adds attribute: interest_rate
method: add_interest()
*/
	
	String account_holder = "Shruti Barmade ";
	double balance = 39808;
	
	void deposit() {
		System.out.println("deposit methos");
	}
	void withdraw() {
		System.out.println("withdraw method");
	}

}
