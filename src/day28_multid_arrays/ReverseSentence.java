package day28_multid_arrays;

import java.util.Arrays;

public class ReverseSentence {
	public static void main(String[] args) {
		
//		Create a string variable called sentence and assign a value
//		find out and print number of words
//		reverse the sentence and assign to new String called reversed
//		print reversed
		
		
		String sentence = "you are very interesting person";
		String[] arrSentence = sentence.split(" ");
		System.out.println(Arrays.toString(arrSentence));
		System.out.println("The sentence is " +arrSentence.length+ " words long");
		String reversed = "";
		for (int i = arrSentence.length - 1 ; i >= 0 ; i--) {
			reversed += arrSentence[i]+" ";
		}
		System.out.print("SENTENCE IN REVERSE: ");
		reversed = reversed.trim();
		System.out.println(reversed);
		
	}
}
