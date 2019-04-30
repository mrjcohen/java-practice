package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		
		int yourAge;
		int votingAge = 18;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How old are you?");
		yourAge = keyboard.nextInt();
		
		
		
		if (yourAge >= 18) {
			
			int yearsOver = yourAge - votingAge;
			System.out.println("Your are eligible to vote and have been for " + yearsOver + " years.");
		
		} else {
			
			int moreYears = votingAge - yourAge;
			//System.out.println("You are still too young to vote and need to wait " + -(yourAge - votingAge) + " more years.");
			//System.out.println("You are still too young to vote and need to wait " + (votingAge - yourAge) + " more years.");
			  System.out.println("You are still too young to vote and need to wait " + moreYears + " more years.");
			
		}
		
		
		
		
	}

}
