package day22_loops_practice2;

public class LookForWordInString {
	public static void main(String[] args) {
		
		
		//How to look for a word within a string
		//String sentence = "He said hi, then she replied bi. hi guys"
		//look for "java" in the sentence and print the count
		
		String sentence = "He said hi, then she replied hi. hi guys";
		int count = 0;
		
		for (int i = 0 ; i < sentence.length() - 1 ; i++) {
			
			if (sentence.substring(i,i+2).equals("hi")) {
				
				count++;
				
			}
			
		}
		
		System.out.println(count);
		
	}
}
