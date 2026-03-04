package com.sb;

public class assignmentoperator {
	public static void main (String args[]) {
    int i= 35;                               //35
    i--;                                     //34
    
    System.out.println(i++);                 //34  //35
    
    System.out.println(i*7);                  //245
    
    --i;                                      //34
    int j = i-4;                              //30
    j++;                                      //31
    j--;                                      //30
    System.out.println(j/2);                  //15
    System.out.println(j);                    //30
    double a = 2;                           //2
    --a;                                   //1.0
    a++;                                   //2.0
    System.out.println(a++);            //2.0   //3.0
    System.out.println(a);                //3.0 
    double b = 4;                        //4
    System.out.println(a%3);              //0.0
    System.out.println(b+=4);              //8.0
    ++b;                                  
    ++a;                                  
    System.out.println(j-2);               //28
    System.out.println(i);                //34
    System.out.println(a);                //4.0
    System.out.println(b);                 //9.0
    
    
    
    

	}

}
