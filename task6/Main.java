package com.task6;

public class Main {
public static void main(String args[]) {
	Payment p1 = new Upi();
    p1.pay(500.0);

    Payment p2 = new CreditCard();
    p2.pay(1500.0);

    Payment p3 = new DebitCard();
    p3.pay(1000.0);
}
}