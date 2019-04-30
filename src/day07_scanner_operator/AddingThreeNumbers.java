package day07_scanner_operator;

import java.util.Scanner;

public class AddingThreeNumbers {
	public static void main(String[] args) {
		
		int num1, num2, num3, sum;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter three number");
		
		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();
		num3 = keyboard.nextInt();
		
		sum = num1 + num2 + num3;
		
		System.out.println("Sum of output: " + sum);
		
		
		
	}

}
