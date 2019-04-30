package day16_string_manipulation;

public class TrimSpaces {
	public static void main(String[] args) {
		
		String word1 = " String methods ";
		System.out.println(word1.trim());		//"String methods"
		
		String word2 = "   ThreeSpaces here   ";
		System.out.println(word2.trim());		//"ThreeSpaces here"
		
		String word3 = ".   ThreeSpaces here   ";
		System.out.println(word3.trim());		//".   ThreeSpaces here"
		
		
		
		
	}
}
