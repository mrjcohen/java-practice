package day08_casting_conditionals;

import java.util.Scanner;

public class GradeCheck {
	public static void main(String[] args) {
		
		/*
		
		
		What is your grade?
		char grade = keyboard.next().charAt(0);
		 if 'A' => "Excellent Job! Keep it up!
		 
		 else
		 
		 how many did you miss for 'A'
		 int points = scanner
		 print "Your grade B is not good enough"
		 "You could earn 10 more points if you studied harder"
		
		*/
		
		System.out.println("##### START OF PROGRAM #####");
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
		System.out.println("What is your grade?");
		  char grade = keyboard.next().toUpperCase().charAt(0);   // -> will change any lower case to uppercase
		//char grade = keyboard.next().charAt(0); 		-> will only work with uppercase letter
		
		if (grade == 'A') {
			
			System.out.println("Excellent Job! Keep it up!");
			
		} else {
			System.out.println("Your grade "+grade+" is not good enough");
			System.out.println("How many points did you miss for 'A'");
			int  points = keyboard.nextInt();
			System.out.println("You could earn "+points+" more points if you studied harder");
			
		}
		
		System.out.println("##### END OF PROGRAM #####");
		
		
	}
}
