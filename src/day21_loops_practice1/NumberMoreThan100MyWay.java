package day21_loops_practice1;

import java.util.Scanner;

public class NumberMoreThan100MyWay {
	public static void main(String[] args) {
	
		//Ask user to enter 2 ints
		//if sum of those ints is not more than 100, then keep asking for 2 nums
		//once sum of those 2 number is more than 100 then print "good numbers" and program ends
		
		
		Scanner scan = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		
		while (num1 + num2 <= 100) {
			
			System.out.println("Enter 2 Numbers");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			
		}
		
		System.out.println("Good Numbers");
		
		
	}
}
