package com.task2;

public class Circle implements Shape {
double radius=5;
	@Override
	public void area() {
		System.out.println("circle area  = " + (3.14*radius*radius));
		
	}

	@Override
	public void perimeter() {
		System.out.println("circle perimeter = " +(2*3.14*radius));
	}

}
