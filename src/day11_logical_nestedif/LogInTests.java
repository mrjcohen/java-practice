package day11_logical_nestedif;

import java.util.Scanner;

public class LogInTests {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String username = scan.nextLine();
		
		System.out.println("Enter Password:");
		String password = scan.nextLine();
		
		String validUsername = "cohenj@vt.edu";
		String validPassword = "WoodenSpoon123";
		
		if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successful, Welcom!");
		} else if (!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid Username and Invalid Password");
		} else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid Password");
		} else if (!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Invalid Username");
		}
		
		
	}

}