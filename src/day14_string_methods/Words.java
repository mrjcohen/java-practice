package day14_string_methods;

import java.util.Scanner;

public class Words {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		//Comparing two string sizes
		
		System.out.println("Enter 2 words");
		String word1 = scan.next();
		String word2 = scan.next();
		
		
		if (word1.length() > word2.length()) {
			System.out.println(word1+ " is larger thant " +word2);
		} else if (word1.length() < word2.length()) {
			System.out.println(word2+ " is larger thant " +word1);
		} else {
			System.out.println(word1+ " and " +word2+ " are the same size");
		}
		
		
		
		
		
		
		
	}

}
