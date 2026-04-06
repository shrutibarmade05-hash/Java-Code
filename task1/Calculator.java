package com.task1;

public class Calculator implements Multiply , Divide, Substract , Add {

	@Override
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
	}

	@Override
	public void sub() {
		int a = 16;
		int b = 20;
		System.out.println(a-b);
		
	}

	@Override
	public void divide() {
		int a = 56;
		int b = 27;
		System.out.println(a/b);
		
	}

	@Override
	public void mul() {
		int a = 100;
		int b = 10;
		System.out.println(a*b);
		
	}

}