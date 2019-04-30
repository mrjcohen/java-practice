package day23_loops_and_arrays;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number to see if it is Prime");
		int number = scan.nextInt();

		for (int i = 2; i <= 9; i++) {

			if (number % number == 0) {

				if (number % i != 0) {

					System.out.println("Number is Prime");
					break;
					
				} else {

					System.out.println("Number is not prime");
					break;
					
				}
			}

		}

		
		
		
	}
}
