package day21_loops_practice1;

import java.util.Scanner;

public class GetUniqueCharacters {
	public static void main(String[] args) {
		
//		Given a string word, print out unique characters from the word
//		
//		Example: wooden spood
//		output: woden sp
//		
//		Example: java
//		output: jav
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter word");
		String word = scan.next();
		String unique = "";
		
		

		for (int i = 0 ; i < word.length() ; i++) {
			
			//read the letter and assign
			char charLetter = word.charAt(i);
			
			//convert the letter to a string
			String stringLetter = Character.toString(charLetter);
			
			//Loop to check see if word contains the letters
			if ( !unique.contains(stringLetter) ) {
				
				//if letter is not contained in unique variable, then add it to unique variable
				unique += stringLetter;
			}

		}
		
		//Print out all the unique character
		System.out.println(unique);
		
		
		
		
		
		
//		char ch = word.charAt(0);
//		
//		System.out.println(unique.contains(""+ch));
//		
//		if (!unique.contains(""+ch)) {               You can also do if (unique.indexOf( ""+word.charAt(i) == -1)
//			unique += ch;
//		}
//		
//		System.out.println(unique);
		
		
		
		
		
		
//		for (int i = 0 ; i < word.length() ; i++) {
//			
//			if  ( !unique.contains(""+word.charAt(i)) ) {
//				
//				unique += word.charAt(i);
//				
//			} 
//			
//		}
//		
//		System.out.println(unique);
		
		
		
		
		
		
		
		
	}
}
