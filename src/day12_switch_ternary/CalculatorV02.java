package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		double num1 = scan.nextDouble();
		
		System.out.println("Enter second number:");
		double num2 = scan.nextDouble();
		
		System.out.println("Select Operation: +, -, *, /, %");
		String operator = scan.next();
		
		double answer = 0;
		
		switch (operator) {
		case "+":
			answer = num1 + num2;
			break;
		case "-":
			answer = num1 - num2;
			break;
		case "*":
			answer = num1 * num2;
			break;
		case "/":
			answer = num1 / num2;
			break;
		case "%":
			answer = num1 % num2;
			break;	
		default:
			System.out.println("Invalid Operator: " +operator);
			return;
		}
		
		
		System.out.println(num1+ " " +operator+ " " +num2+ " = " +answer);
		
	}

}