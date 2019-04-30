package day23_loops_and_arrays;

import java.util.Scanner;

public class CalculateSum {
	public static void main(String[] args) {
		
		//White a program 
		//That will calculate the sum of 6 numbers.
		//If number is less or equal to 0 - ignore this number
		//We need to ask user to provide a number
		
		Scanner scan = new Scanner (System.in);
		
		int sum = 0;
		
		
		for (int i = 1 ; i <= 6 ; i++) {
			
			System.out.println("Enter a number");
			int num = scan.nextInt();
			
			if (num <= 0) {
				continue;
			} 
				
			sum += num;
				
			
			
			
			
		}
		
		System.out.println(sum);
	}
}
