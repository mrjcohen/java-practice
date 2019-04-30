package day15_string_manipulation;

public class Substring {
	public static void main(String[] args) {
		//                           11111111112222222222
		//                 012345678901234567890123456789
		String sentence = "Java String manipulation is fun!";
		System.out.println(sentence.substring(0,4));	//"Java"
		System.out.println(sentence.substring(5,11));	//"String"
		System.out.println(sentence.substring(7,11));	//"ring"
		System.out.println(sentence.substring(12,15));	//"man"
		
	}
}
