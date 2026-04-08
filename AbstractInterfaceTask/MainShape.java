package com.AbstractInterfaceTask;

public class MainShape {
public static void main(String args[]) {
	Shape s = new Circle();
	s.area();
	s = new Rectangle();
	s.area();
	
	s=new Triangle();
	s.area();
}
}
