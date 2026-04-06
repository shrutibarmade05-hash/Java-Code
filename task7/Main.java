package com.task7;

public class Main {
	 public static void main(String[] args) {
	        Bank sbi = new Sbi();
	        sbi.deposit(2000);
	        sbi.withdraw(1500);
	        sbi.checkBalance();

	        Bank hdfc = new Hdfc();
	        hdfc.deposit(3000);
	        hdfc.withdraw(6000);
	        hdfc.checkBalance();
}}
