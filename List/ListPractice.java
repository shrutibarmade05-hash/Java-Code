package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ListPractice {
public static void main(String args[]) {
	
//	Write a java program to create ArrayList and add 10 integers and print them.
	
/*	ArrayList list = new ArrayList();
	list.add(440);
	list.add(56);
	list.add(26);
	list.add(86);
	list.add(12);
	list.add(40);
	list.add(47);
	list.add(23);
	list.add(12);
	list.add(3);
	System.out.println(list);
	*/
	
	
	

//Write a program to add element in the vector and display them using for each loop.
	/*
	
	Vector <Integer>list = new Vector<Integer>();
	list.add(340);
	list.add(86);
	list.add(12);
	list.add(40);
	list.add(47);
	list.add(23);
	
	
	for (Integer object : list) {
		System.out.println(object);
	}
	*/
	
	
	
	
	
	
	
//Crate a linkedlist of string to print all string elements.
	/*
	LinkedList <String> list = new LinkedList<String>();
	list.add("Hello");
	list.add("hii");
	list.add("bye");
	list.add("hsrg");
	list.add("vijay");
	list.add("Shruti");
	list.add("djjf");
	list.add("shuru");
	
	
	for (String d : list) {
		System.out.println(d);
	}
	*/
	
	
	
	
	
//Write a program to find size of an array list.----------------
	/*
	ArrayList list = new ArrayList();
	list.add(440);
	list.add(56);
	list.add(26);
	list.add(86);
	list.add(12);
	list.add(40);
	list.add(47);
	list.add(23);
	list.add(12);
	System.out.println(list.size());
	*/
	
	
	
	
// Write a program to check whether an elements exists in vector.
	/*
	Vector <Integer>list = new Vector<Integer>();
	list.add(340);
	list.add(86);
	list.add(12);
	list.add(40);
	list.add(47);
	list.add(23);
	System.out.println(list.contains(86));
*/
	
	
	
	
// Write a program to get first element and last elements from a linkedlist.
	
	/*LinkedList list = new LinkedList();
	list.add(4);
	list.add(1234);
	list.add("Shruti");
	list.add(22.3f);
	list.add(5784.2);
	list.add(5676778l);
	list.add(true);
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	*/
	
	
	

//Write a program to remove a specific element from an arrayList.
/*	
	ArrayList list = new ArrayList();
	list.add(4);
	list.add(1234);
	list.add("Shruti");
	list.add(22.3f);
	list.add(5784.2);
	list.add(5676778l);
	list.add(true);
	System.out.println(list.remove(6));
	*/
	
	
	

	
// write a program to update(replace) an element at a specific index in a vector.
	
/*	Vector list = new Vector();
	list.add(4);
	list.add(1234);
	list.add("Shruti");
	list.add(22.3f);
	list.add(5784.2);
	list.add(5676778l);
	
	list.set(4, "49");
	System.out.println(list);
	*/
	
	
	
	
	
	
// write a program to iterate an arraylist to vector.
	/*
	 ArrayList<Integer> arrayList = new ArrayList<>();

     arrayList.add(10);
     arrayList.add(20);
     arrayList.add(30);
     arrayList.add(40);

     Vector<Integer> vector = new Vector<>();

     for (Integer value : arrayList) {
         vector.add(value);
     }

     System.out.println(vector);
	}
	*/
	
	
	
	
// Write a program to reverse a LinkedList.
	
	/*LinkedList list = new LinkedList();
	list.add(4);
	list.add(1234);
	list.add("Shruti");
	list.add(22.3f);
	list.add(5784.2);
	list.add(5676778l);
	Collections.reverse(list);

    System.out.println(list);
	
	*/
	
	
	

	
// Write a program to sort arraylist in ascending order.
	
/*	ArrayList<Integer> list = new ArrayList<>();

    list.add(50);
    list.add(10);
    list.add(40);
    list.add(30);
    list.add(20);

   Collections.sort(list);

    System.out.println(list);
	
	*/
	
	
	
	
// Write a program to copy elements from arraylist vector
	
	/* ArrayList<Integer> arrayList = new ArrayList<>();

     arrayList.add(10);
     arrayList.add(20);
     arrayList.add(30);
     arrayList.add(40);

     Vector<Integer> vector = new Vector<>();

     // Copy elements using loop
     for (Integer value : arrayList) {
         vector.add(value);
     }

     System.out.println("Vector: " + vector);
     */
	
	
	

// write a program to insert an element at a specific position in linkedlist.
	
/*	LinkedList list = new LinkedList();
	list.add(4);
	list.add(1234);
	list.add("Shruti");
	list.add(22.3f);
	list.add(5784.2);
	list.add(5676778l);
	
	list.add(2, 3889);
	System.out.println(list);
	*/
	
	
	
// Write a program to remove duplicate from arraylist----------------
	
/*	  ArrayList<Integer> list = new ArrayList<>();
	list.add(1234);
	list.add(45);
	list.add(22);
	list.add(67);
	list.add(8);
	list.add(8);
	list.add(3);
	list.add(4);
	list.add(345);
	

    ArrayList<Integer> unique = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
        if (!unique.contains(list.get(i))) {
            unique.add(list.get(i));
        }
    }

    System.out.println(unique);
*/
	
	
	
	
	
	
// Write a program to merge two arraylist vector.
/*	
	ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    list1.add(10);
    list1.add(20);
    list1.add(30);

    list2.add(40);
    list2.add(50);
    list2.add(60);

    Vector<Integer> vector = new Vector<>();

    vector.addAll(list1);
    vector.addAll(list2);

    System.out.println(vector);
    */
	
	
	
	
	
// write a program to convert vector into arraylist.
	
	/* 
    Vector<Integer> vector = new Vector<>();

    vector.add(10);
    vector.add(20);
    vector.add(30);
    vector.add(40);

    ArrayList<Integer> arrayList = new ArrayList<>(vector);

    System.out.println(arrayList);
	*/
	
	
	
//Write a program to search an elemnts in linkedlist and display its position.
	
/*	 LinkedList<Integer> list = new LinkedList<>();

     list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);
     list.add(50);

     int searchElement = 30;

     int position = list.indexOf(searchElement);

     System.out.println("Position: " + position);
	*/
	
	
	
	
	
//write a program to compare two arraylist objects.
	/*
	ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    list1.add(10);
    list1.add(20);
    list1.add(30);

    list2.add(10);
    list2.add(20);
    list2.add(30);

    System.out.println(list1.equals(list2));
	
	*/
	
	
	
	
// write a program to count number of elemnets in vector-------
	
	/*Vector<Integer> list = new Vector<>();

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);

    System.out.println("Number of elements: " + list.size());
	*/
	
	
	
	
	
// write a program to transfer data from arraylist --> vector--->linkedlist and display all.
	
	
	 // ArrayList
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(10);
    arrayList.add(20);
    arrayList.add(30);

    // ArrayList → Vector
    Vector<Integer> vector = new Vector<>(arrayList);

    // Vector → LinkedList
    LinkedList<Integer> linkedList = new LinkedList<>(vector);

    // Display all
    System.out.println("ArrayList: " + arrayList);
    System.out.println("Vector: " + vector);
    System.out.println("LinkedList: " + linkedList);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
