package day23_loops_and_arrays;

import java.util.Scanner;

public class BruteForce {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		String username = "";
		String password = "";
		int attempts = 5;

		do {
            if(attempts == 0) {
                System.out.println("You have exceeded number ot attampts");
                System.out.println("This user has bee deactivated for 30 minutes");
                return;
            }
            attempts--;
            System.out.println("Please enter user name");
            username = scan.next();
            if(!username.equals(expectedUserName)) {
                System.out.println("Wrong user name");
                System.out.println("Attempts left: "+attempts);
                continue;
            }
            System.out.println("Please enter password");
            password = scan.next();
            if(!password.equals(expectedPassword)) {
                System.out.println("Wrong password");
                System.out.println("Attempts left: "+attempts);
                continue;
            }
        }while(!username.equals(expectedUserName) || !password.equals(expectedPassword));
        
        System.out.println("Login successful!");
    }
}