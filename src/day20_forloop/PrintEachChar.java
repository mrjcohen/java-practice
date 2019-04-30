package day20_forloop;

public class PrintEachChar {
	public static void main(String[] args) {
		
		String word = "Wooden Spoon";
		
		//USING A FOR LOOP, PRINT EACH CHAR ONE BY ONE
		
		for (int i = 0 ; i < word.length() ; i++ ) {
		
			System.out.print(word.charAt(i)+ ", ");
			
		}
		
		System.out.println();
		
		
		
		
		//USING A FOR LOOP, PRINT ONLY CONSONANTS
		
		
		for (int i = 0 ; i < word.length() ; i++ ) {
			
			char letter = word.toLowerCase().charAt(i);
			
			if ( !(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') ) {
				
				System.out.print(letter+ ", ");
				
			} 
			
		}
		
		System.out.println();
		
		
		
		
		//USING A FOR LOOP, PRINT ONLY VOWELS (A,E,I,O,U)
		
		for (int i = 0 ; i < word.length() ; i++ ) {
			
			char letter = word.toLowerCase().charAt(i);
			
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				
				System.out.print(letter+ ", ");
				
			} 
			
			
		}
		
		
		
	}
}
