package day15_string_manipulation;

public class Contains {
	public static void main(String[] args) {
		
		String email = "test@gmail.com";
		
		System.out.println(email.contains("@"));			//true
		
		
		
		String list = "potatoes, apples, tomatoes, eggs, milk, break, meat";
		
//Check if list contains apples (without using variables)
		
		if (list.contains("apples")) {						//true
			System.out.println("Apples are there!");
		} else {
			System.out.println("Lets Add apples now!");
		}
		
		
		
		
//Check if list contains eggs (using variables)
		
		boolean hasEggs = list.contains("eggs");		
		
		System.out.println(hasEggs);						//true
		
		
		
//Check if list contains cucumbers (using variables)
		
		boolean hasCucumbers = list.contains("cucumbers");
		
		System.out.println(hasCucumbers); 					//false
		
		
		
//Check if an email address contains one of three domains
		
		email = "name@yahoo.com";
		
		if (email.contains("@yahoo")) {
			System.out.println("Yahoo account");
		} else if (email.contains("@gmail")) {
			System.out.println("Gmail account");
		} else if (email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}
	
	
		
		
//Check if the etsy tab contains a | in it
		
		String etsyTitle = "Wooden spoon | Etsy";
		
		if (etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		} else {
			System.out.println("Pipe is not needed");
		}
		
		
		
//Check if my name contains a 'a' or 'e' in it
	
		String name = "Jonathan";
		
		if (name.contains("a") || name.contains("e")) {
			System.out.println("My name contains an 'a' or and 'e'");
		} else {
			System.out.println("My name does not contain an 'a' or 'e' ");
		}
			
	
	
	}
}
