package day31_methods03;

import java.util.Arrays;

public class MethodsWithStrings {
	public static void countWords (String sentence) {
		String[] wordArray = sentence.split(" ");
		int numberOfWords = wordArray.length;
		System.out.println("Words in this sentence "+Arrays.toString(wordArray));
		System.out.println("Number of words: "+numberOfWords);
	}
	
	public static void googleSearchResults (String result) {
		String[] resultArray = result.split(" ");
		String searches = resultArray[1].replace(",","");
		String time = resultArray[3].replace("(", "");
		System.out.println("Results count: " +searches);
		System.out.println("Time in seconds: " +time+ " seconds");
	}
	
	public static void main(String[] args) {
		
		countWords("Java is fun");
		googleSearchResults("About 121,000,000 results (0.75 seconds)");
		
	}
}
