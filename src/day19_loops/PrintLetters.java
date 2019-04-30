package day19_loops;

public class PrintLetters {
	public static void main(String[] args) {
		String word = "hello";
		
		//Print each character 1 by 1 in separate lines
		int idx = 0;
		
		while (word.length() > idx) {
			
			System.out.println(word.charAt(idx++));
			
//			System.out.println(word.charAt(num));    	YOU CAN COMBINE System.out.println WITH THE INCREMENTAL OPERATOR (num++)
//			num++;
		}

		
		//Print each character in the reverse order
		
		int idx2 = word.length() - 1;
		
		while  (idx2 >= 0) {
			
			System.out.println(word.charAt(idx2));
			idx2--;

		}
	
		
		
		
	}
}
