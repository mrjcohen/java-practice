package day19_loops;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		//PALENDROME CHECKER
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a word to check it is a palendrome");
		String word = scan.next();
		String reversed = "";
		
		int idx = word.length() - 1;
		
		while (idx >= 0) {
			reversed = reversed + word.charAt(idx);
			idx--;
		}
		
		if (word.equalsIgnoreCase(reversed)) {
		System.out.println(word.equals(reversed)+ ": " +word+ " is a palendrome");
		} else {
			System.out.println(word.equals(reversed)+ ": " +word+ " and " + reversed+" are not palendromes");
		}
		
		
	}
}
