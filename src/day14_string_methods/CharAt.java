package day14_string_methods;

public class CharAt {
	public static void main(String[] args) {
		
		//             12345678
		String word = "Computer";
		
		//print all characters
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
	
		
		
		
		
		//String word2 and check if first character is 'J'
		
		String word2 = "Don";
		
		if (word2.charAt(0) == 'J') {
			System.out.println("word starts with J");
		} else {
			System.out.println("word does not start with J");
			
		}
		
		
		
		
		
		//String word3 that consists of 5 characters
		//Check if first and last characters are the same
		
		
		String word3 = "civic";
		
		if (word3.charAt(0) == word3.charAt(4)) {
			System.out.println("First and last match");
		} else {
			System.out.println("First and last are different");
		}
		
		
		//Ternary method
		String answer = (word3.charAt(0) == word3.charAt(4)) ? "yes" : "no";
		
		
		
		
		
		
		
		//String word4 (unknown length) always print the last char
		
		String word4 = "thisistest";
		
		char lastChar = word4.charAt(word4.length() - 1);
		
		System.out.println(lastChar);
		
		
	}

}
