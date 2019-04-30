package day16_string_manipulation;

public class PutWordsInBetween {
	public static void main(String[] args) {
		
		String chars = "<<>>";
		String word = "java";
		
		//output    <<java>>
		
		String result = chars.substring(0,2) + word + chars.substring(2, 4);
		
		System.out.println(result);
		
	}

}
