package day09_stringequals_condtionals;

import java.util.Scanner;

public class Canada {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the capital of Canada?");
		
		String capital = keyboard.next();
		
		if ( capital.equalsIgnoreCase("Ottawa") ) {			//capital.equals("Ottawa")  <- CASE SENSTIVE
															//capital.equalsIgnoreCase("Ottawa") <- NOT CASE SENSITIVE
			System.out.println("Your answer is correct:");
			
		} else {
		
			System.out.println("Your answer is incorect! " +capital+ " is not the capital of Canada");
			
		} 
			
		
			
		
	}

}
