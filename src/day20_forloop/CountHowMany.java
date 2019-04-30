package day20_forloop;

public class CountHowMany {
	public static void main(String[] args) {
		
		//COUNT HOW MANY TIMES A LETTER IS FOUND IN A STRING
		
		String word = "computer programming";
		char myChar = 'm';
		int counter = 0;
		
		for (int i = 1 ; i < word.length() ; i++) {
			
			if (word.charAt(i) == 'm') {
				counter++;
			}
			
			
		}
	
		System.out.println("The letter "+myChar+" appears "+counter+" times in the word "+word );
	
	
	}
}
