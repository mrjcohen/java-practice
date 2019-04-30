package day19_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
	public static void main(String[] args) {
		System.out.println("##### WELCOME TO THE NUMBER GUESSING GAME ##### \n \nGuess a number between 1 and 100 \n");
	
		
		Scanner scan = new Scanner (System.in);
		Random random = new Random();
	
		//Guess a number
		
		int secretNumber = random.nextInt(101);  //Will assign secretNumber a random number from 0 to 100 (101 not included)
		int guessNumber = 0;
		
		do {
		System.out.println("Guess a number\n");
		guessNumber = scan.nextInt();
		
		
			if (secretNumber < guessNumber) {
				System.out.println("\nYou guessed too large\n");
			} else if (secretNumber > guessNumber) {
				System.out.println("\nYou guessed too small\n");
			}
			
			
		} while (secretNumber != guessNumber);
		
		System.out.println("\nBingo, Congratulation, you won!");
		
		
		
		
	}
}


