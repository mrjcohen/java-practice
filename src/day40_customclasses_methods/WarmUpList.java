package day40_customclasses_methods;

import java.util.ArrayList;

public class WarmUpList {
	public static int countOccurances(ArrayList<String> wordList , String word) {
		
		int count = 0;
		
		for (String w : wordList) {
			if (w.equalsIgnoreCase(word)) {
				count++;
			}
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Moon");
		list.add("Sun");
		list.add("Mars");
		list.add("Saturn");
		list.add("Sun");
		list.add("Venus");
		list.add("Earth");
		list.add("Pluto");
		list.add("Sun");
		list.add("Mercury");
		list.add("Neptune");
		
		
		String targetWord = "Sun";
		
		int wordCount = countOccurances(list, targetWord);
		System.out.println("\"" +targetWord+ "\" appears " +wordCount+ " times in the list.");
		
		
		
	}
}
