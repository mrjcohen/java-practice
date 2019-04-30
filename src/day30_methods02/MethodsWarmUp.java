package day30_methods02;

import java.util.Scanner;

public class MethodsWarmUp {
	
	public static void print5Stars() {
		for (int i = 1 ; i <= 100 ; i++) {
			System.out.println("* * * * *");
		}
		
	}
	
	public static void introduce() {
		Scanner scan = new Scanner (System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		System.out.println("Nice to meet you "+name);
	}
	
	public static void main(String[] args) {
		print5Stars();
		introduce();
		
		
	}
}
