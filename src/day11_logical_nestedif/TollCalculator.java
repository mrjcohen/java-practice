package day11_logical_nestedif;

import java.util.Scanner;

public class TollCalculator {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Vehicle Type: ");
		int carType = keyboard.nextInt();	
		
		System.out.println("Is it rush hour: yes | no");
		String answer = keyboard.next();
		
		//Check if rushHour String is yes - assign true to isRushHour
		//if it is no - assign false to isRushHour
		boolean isRushHour = false;
		
		if (answer.equalsIgnoreCase("yes")) {
			isRushHour = true;
		} else if (answer.equalsIgnoreCase("no")) {
			isRushHour = false;
		} else {
			System.out.println("You did not type yes or no");
		}
		
		
		
		double price = 0.0;
		
		if (carType == 1) {
			if (isRushHour) {
				price = 30.0;
			} else {
				price = 5.0;
			}
		} else if (carType == 2) {
			if (isRushHour) {
				price = 55.30;
			} else {
				price = 15.99;
			}
		}
		
		System.out.println("Toll cost: $" +price);

	}
}
