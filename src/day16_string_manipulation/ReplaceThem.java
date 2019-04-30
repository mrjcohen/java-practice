package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		
		String sentence = "Coding is fun, it is my hobby!!";
		
		String withNoSpaces = sentence.replace(" ", "");	//Find all spaces and replace with no spaces
		System.out.println(withNoSpaces);					//Codingisfun,itismyhobby!!
		
		sentence = sentence.replace(",","!");				//Find all comma and replace with exclamation and then assign to sentence variable
		System.out.println(sentence);
		
		String mixed = "&^@#j$a-v|a@#$";
		
		//replacing with several characters in a string
		mixed = mixed.replace("&^@#", "");					
		System.out.println(mixed);							//j$a-v|a@#$
		mixed = mixed.replace("@#$", "");					
		System.out.println(mixed);							//j$a-v|a
		
		//replacing with on character at a time in a string
		mixed = mixed.replace("&", "");
		mixed = mixed.replace("$", "");
		mixed = mixed.replace("-", "");
		mixed = mixed.replace("|", "");
		
		//chaining the replace method into a single line of code
		mixed = mixed.replace("&", "").replace("$", "").replace("-", "").replace("|", "");
	
		System.out.println(mixed);							//java
		
		
		
		//using replace and substring, get the number of results
		String result = "About 115,000,000 results (0.59 seconds)";
		
		
		result = result.replace("About ", "");					//115,000,000 results (0.59 seconds)
		result = result.substring(0 , result.indexOf(" "));		//115,000,000  <- Murodil's Method is way better than my Method
		//result = result.replace(result.substring(11), "");	//115,000,000  <- My Method (depends on number size of so its not good)
		System.out.println(result);
		
		result = result.replace(",",  "");						//Removes commas
		System.out.println(result);								//115000000  <- String
		
		int number = Integer.parseInt(result);					//turns String "" into integer
		System.out.println(result);								//115000000  <- integer

	}
}
