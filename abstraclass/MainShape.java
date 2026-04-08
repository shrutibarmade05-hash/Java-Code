package com.abstraclass;

public class MainShape {
	 public static void main(String[] args) {

	        Shape shape = new Circle();
	        shape.calculateArea();

	        shape = new Rectangle();
	        shape.calculateArea();

	        shape = new Triangle();
	        shape.calculateArea();
	    }
}
