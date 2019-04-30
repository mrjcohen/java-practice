package day26_arrays04;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		
		String words = "java,kava,html,selenium";
		
		//Splits the String words into an array using commas as a delimiter 
		String[] wordsArray = words.split(",");
		//Prints how long the array is
		System.out.println("count: " +wordsArray.length);
		//Prints all values in the array in brackets
		System.out.println(Arrays.toString(wordsArray));
		//for each loop that prints each value in the array
		for (String allwords : wordsArray) {
			System.out.println(allwords);
		}
		
		
		
		String diceResult = "1 - 20 of 1,461 positions";
		String[] diceArray = diceResult.split(" ");
		System.out.println("Search result total: "+diceArray[4]);
		
		
		String[] diceArray2 = diceResult.split("of");
		System.out.println(diceArray2[0]);	//1 - 20 
		System.out.println(diceArray2[1]);	// 1,461 positions
		//Removes spaces on either end
		System.out.println(diceArray2[0].trim());	//1 - 20
		System.out.println(diceArray2[1].trim());	//1,461 positions
		
		
		
		
		String sentence = "I felt happy because I saw the others were happy and because I "
							+ "knew I should feel happy, but I wasn’t really happy.";
		
		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] ISplit = sentence.split("I");
		
		//Print arrays in one line
		//System.out.println(Arrays.toString(allWords));
		//System.out.println(Arrays.toString(happySplit));
		//System.out.println(Arrays.toString(ISplit));
		
		//Print arrays on separate lines and remove extra spaces with trim()
		for (String w : allWords) {
			System.out.println(w.trim());
		}
		
		for (String h : happySplit) {
			System.out.println(h.trim());
		}
		
		for (String i : ISplit) {
			System.out.println(i.trim());
		}
		
		
		
		String word = "java";
		//converts word "java" into an array of chars
		char[] chars = word.toCharArray();
		
		for (char ch : chars) {
			System.out.println(ch);
		}
		
		
		
		
		
		
		
	}
}
