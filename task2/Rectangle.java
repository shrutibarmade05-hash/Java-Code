package com.task2;

public class Rectangle implements Shape {
	double length =4;
	double width=5;

	@Override
	public void area() {
		System.out.println("rectangle area = " +(length*width));
		
	}

	@Override
	public void perimeter() {
		   System.out.println("Rectangle Perimeter = " + (2 * (length + width)));
	}
}