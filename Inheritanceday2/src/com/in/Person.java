package com.in;

public class Person {

/*	3> 
	Base class: Person

	attributes: name, age
	method: introduce()
	Derived class: Student
	adds attribute: grade
	method: study()*/
	
	String name = "Shruti";
	int age = 21;
	void introduce() {
		System.out.println("Person name = "+name);
		System.out.println("person age = "+ age);
	}
	
}
