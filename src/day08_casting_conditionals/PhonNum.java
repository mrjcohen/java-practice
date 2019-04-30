package day08_casting_conditionals;

import java.util.Scanner;

public class PhonNum {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your area code: ");
		int areaCode = keyboard.nextInt();
		
		System.out.println("Enter your local number: ");
		int localNumber = keyboard.nextInt();
		
		String phoneNumber = "(" +areaCode+ ")-" +localNumber;
		
		System.out.println("Calling Number: " +phoneNumber);
		
		
		
	}

}
