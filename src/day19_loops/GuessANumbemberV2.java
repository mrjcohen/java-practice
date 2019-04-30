package day19_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessANumbemberV2 {
	public static void main(String[] args) {

		int guessCounter = 5;
		System.out.println(
				"##### WELCOME TO THE NUMBER GUESSING GAME ##### \n \nGuess a number between 1 and 100 \nYou have "
						+ guessCounter + " tries");

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		// Guess a number

		int secretNumber = random.nextInt(101); // Will assign secretNumber a random number from 0 to 100 (101 not
												// included)
		int guessNumber = 0;

		while (guessCounter > 0) {
			
			System.out.println("\nGuess a number\n");
			guessNumber = scan.nextInt();
		
			if (guessNumber == secretNumber) {
				System.out.println("Congratulations, you guessed the number!");
				return;
			} else if (guessNumber > 100) {
				System.out.println("\nYou need to guess a number between 1 and 100\n");
				System.out.println("You still have " + guessCounter + " tries left");
			} else if (secretNumber < guessNumber) {
				System.out.println("\nYou guessed too large\n");
				guessCounter--;
				System.out.println("You have " + guessCounter + " tries left");
			} else if (secretNumber > guessNumber) {
				System.out.println("\nYou guessed too small\n");
				guessCounter--;
				System.out.println("You have " + guessCounter + " tries left");
			}
				

		}
			System.out.println("\nSorry you ran out of tries");
			return;
		
			
		
		
		
		
		
		
		
	}
}
