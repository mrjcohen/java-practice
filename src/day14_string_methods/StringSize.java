package day14_string_methods;

import java.util.Scanner;

public class StringSize {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		//Check if it matches "Good Morning"
		
		String str1 = "Good Morning";
		
		if (str1.equals("Good Morning")) {
			System.out.println("Match");
		} else {
			System.out.println("Not Match");
		}
			
		
		
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		} else {
			System.out.println("Not Match - ingnore case");
		}
		


		System.out.println(str1.toUpperCase());  // This does not assign uppercase to str1. It just prints it out
		System.out.println(str1);
		
		str1 = str1.toUpperCase();				//This does assign uppercase to str1
		System.out.println("After assignment: " +str1);
		
		
		//convert to all lowercase first then check if it equals ("good morning") using method chaining
		
		if (str1.toLowerCase().equals("good morning")) {
			
			System.out.println("Chaned methods: match");
			
		} else {
			
			System.out.println("Chaned methods: do not match");
			
		}
		
		
		//Find out how many characters in the string
		
		String myName = "Jon";
		
		System.out.println(myName.length());

		
		int length = myName.length();
		
		System.out.println("My name has " +length+ " characters in it.");
		
		
		
		
		
		//Username must be exactly 8 character
		
		String userName = scan.next();
		
		if (userName.length() == 8) {
			System.out.println("UserName is 8 characters long");	
		} else {
			System.out.println("UserName is not 8 characters long");
		}	
			
			
			
		//Password must be at least 6 characters
			
		String password = scan.next();
		
		if (password.length() >= 6) {
			System.out.println("Password is equal to or more that 6 character");
		} else {
			System.out.println("Password is less that 6 characters");
		}
			
			
			
		boolean passwordMoreThanSix = (password.length() >=	6) ? true : false;
		
		System.out.println("Is password more than or equal to six? " +passwordMoreThanSix);
		
		//Comparing two string sizes
		
		String word1 = scan.next();
		String word2 = scan.next();
		
		
		if (word1.length() > word2.length()) {
			System.out.println(word1+ " is larger thant " +word2);
		} else if (word1.length() < word2.length()) {
			System.out.println(word2+ " is larger thant " +word1);
		} else {
			System.out.println(word1+ " and " +word2+ " are the same size");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
