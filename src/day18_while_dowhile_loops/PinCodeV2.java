package day18_while_dowhile_loops;

import java.util.Scanner;

public class PinCodeV2 {
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		int secretPincode = 4321;
		int attempts = 3;
		int pincode = 0;

		while (pincode != secretPincode) {

			System.out.println("Enter pincode");
			System.out.println("You have " + attempts + " attempts");
			pincode = scan.nextInt();
			attempts--;

			if (attempts == 0) {

				System.out.println("Card is blocked");
				return;
			}

		}

		System.out.println("Access Granted");




	}
}
