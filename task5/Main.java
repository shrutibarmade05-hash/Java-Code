package com.task5;

public class Main {
public static void main(String args[]) {
	  Printer p1 = new InkjetPrinter();
      p1.print();

      Printer p2 = new LaserPrinter();
      p2.print();
}
}
