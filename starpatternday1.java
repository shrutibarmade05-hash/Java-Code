package com.star;

public class starpatternday1 {

	public static void main(String[] args) {
		
	/*    *****     
		  *****     
		  *****     
		  *****     
		  *****  
		

		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=5;j++) {
				System.out.print("*");
			}System.out.println("     ");
		}
		
		
--------------------------------------------------------------------------------------------------------------	
		*     
		**     
		***     
		****     
		*****   
		
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
----------------------------------------------------------------------------------------------------------------		
		
		*****
		****
		***
		**
		*             
		
		for(int i = 1; i<=5; i++) {
			for(int j =5; j>=i;j--) {
				System.out.print("*");
			}System.out.println();
		}
		
---------------------------------------------------------------------------------------------------------------------		
	                         *
                            **
                           ***
                          ****
                         *****
		
		for (int i = 1; i <= 5; i++) {  //row
	
					for (int j = 1; j <= 5 - i; j++) { // space
							System.out.print(" ");
					}
		
						for (int j = 1; j <= i; j++) { // Column
							System.out.print("*");
					}
					System.out.println();
			
		}
				
----------------------------------------------------------------------------------------------------------------------------
	
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
	
		
		

		for (int i = 1; i <= 5; i++) { // rows
			
				for (int j = 1; j <= 5 - i; j++) { // space
					System.out.print(" ");
					}
			
					for (int j = 1; j <= i; j++) { // Column
						System.out.print("* ");
					}
			
				System.out.println();
		
				}
		
--------------------------------------------------------------------------------------------------------------------------		
		
		 * 
          *  * 
            *  *  * 
              *  *  *  * 
                *  *  *  *  * 

	 */	
		for (int i = 5; i >= 1; i--) { // rows
			
			for (int j =5; j>= i; j--) { // space
				System.out.print(" ");
				}
		
				for (int j =5; j >= i; j--) { // Column
					System.out.print(" * ");
				}
		
			System.out.println();
			}
		
}
}
