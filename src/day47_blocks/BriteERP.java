package day47_blocks;

import java.time.LocalDateTime;

public class BriteERP {

	//(static block) automatically runs in the beginning
	static {
		System.out.println("Launch Browser");
		System.out.println("Navigate to: " + TestData.url);
	}
	
	public static void enterEmail() {
		System.out.println("Enter email: " + TestData.email);
	}
	
	public static void enterPassword() {
		System.out.println("Enter password: " + TestData.password);
	}
	
	public static void verifyLogin() {
		System.out.println("Expected Name: " + TestData.username);
		System.out.println("Actual Name displayed: Viktoriia Lugovska" );
		System.out.println("Login Successful - " + LocalDateTime.now());
	}
}
