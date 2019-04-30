package day08_casting_conditionals;

import java.util.Scanner;

public class IfElseWithScanner {
	public static void main(String[] args) {
		
		//passingPercentage = 65
		//yourScorePercentage = take from scanner
		//check if you passed or failed
		
		Scanner keyboard = new Scanner(System.in);
		
		int passingPercentage = 65;
		
		System.out.println("What is your test score?");
		
		int yourScorePercentage = keyboard.nextInt();
		
		
		
		
		
		if (yourScorePercentage >= passingPercentage) {
			
			System.out.println("YOU PASSED! CONGRATULATIONS1");
			
		} else {
			
			System.out.println("YOU FAILED! STUDY MORE! DONT BE SAD!");
		}
		
		
		
		System.out.println("Java is fun!");
		
		
		
	}

}
