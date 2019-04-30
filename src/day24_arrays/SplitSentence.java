package day24_arrays;

public class SplitSentence {
	public static void main(String[] args) {
		//SPLIT THE SENTENCE
		String sentence = "Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.";
		
		//Converts an array of sentences into words
		String[] words = sentence.split(" ");
		for (String str: words) {
			System.out.println(str);
		}
		//This will print the first word in the newly converted sting to array
		System.out.println(words[0]);	//Java
		

		
	}
}
