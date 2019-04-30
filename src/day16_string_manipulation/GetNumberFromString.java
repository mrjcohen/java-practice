package day16_string_manipulation;

public class GetNumberFromString {
	public static void main(String[] args) {
		
		String sentence = "I wrote [236] line of code today";
		
		
//Murodil's Method
		
		//print number in brackets
		int firstBracket = sentence.indexOf('[') + 1;
		int lastBracket = sentence.lastIndexOf(']');

		String codeCount = sentence.substring(firstBracket , lastBracket);
		
		System.out.println("Lines of code: " +codeCount);
		
		//check if code is more than 20
		int count = Integer.parseInt(codeCount);
		
		if (count > 20) {
			System.out.println("Wrote more than 20 lines of code today");
		} else {
			System.out.println("Not enough coding for today");
		}
	


//Murodil's Method - condensed		
		
		System.out.println("Lines of code: " +sentence.substring(sentence.indexOf('[') + 1 , sentence.lastIndexOf(']')));
		
		
		
		
		
/*
		
//My Method
  
 		//print number in brackets
		int firstBracket = sentence.indexOf('[');
		int lastBracket = sentence.lastIndexOf(']');

		System.out.println(sentence.substring(firstBracket + 1 , lastBracket));
		
		
		//check if code is more than 20
		DID NOT DO IT
		
*/
		
	}
}
