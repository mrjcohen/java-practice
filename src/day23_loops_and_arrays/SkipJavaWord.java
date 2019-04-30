package day23_loops_and_arrays;

import java.util.Scanner;

public class SkipJavaWord {
	public static void main(String[] args) {
		
		//Wirte a program that will concat 6 words with commas
		//if word is java then skip it
		
		Scanner scan = new Scanner (System.in);
		String concatWords = "";
		
		for (int i = 1 ; i <= 6 ; i++) {
			
			System.out.println("Enter a word");
			String word = scan.next();
			
			if (word.equals("java")) {
				continue;
			}
			
			concatWords += word + ", ";
			
			
		}
		
		concatWords = concatWords.substring(0 , concatWords.length() - 2);
		//
		
		
		System.out.println(concatWords);
		
	}
}
