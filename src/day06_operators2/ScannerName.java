package day06_operators2;

import java.util.Scanner;		// import must be under the package

public class ScannerName {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi, What is your name?");
		
		String name = input.next();   //accepts string input (one word)
		String name2 = input.nextLine();   //accepts string input (Everything typed including spaces)
		
		System.out.println("Nice to meet you, " + name);
		System.out.println("Nice to meet you, " + name2);
		
		
	}

}
