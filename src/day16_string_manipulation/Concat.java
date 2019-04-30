package day16_string_manipulation;

public class Concat {
	public static void main(String[] args) {
		
		String word = "java";
		
		word.concat(" selenium"); //java selenium
		
		//word = word.concat(123);	//does not work with concat()
									//Cant add String to number
		
		word = word + 123;			//Concat with a + does allow 
									//String + number
		
		System.out.println(word);	//java123
		
		//Chainging with concat
		String word2 = "hi";
		word2 = word2.concat(" how").concat(" are").concat(" you");
		System.out.println(word2);
		
		
		
	}
}
