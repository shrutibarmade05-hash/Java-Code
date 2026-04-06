package com.poly;

public class Main {
public static void main(String args[]) {
	Amazon a = new Amazon();
	a.orderPlaced("Iphone");
	a.orderPlaced("Iphone", 55000);
	a.orderPlaced("Iphone", 55000, 1);
}
}
