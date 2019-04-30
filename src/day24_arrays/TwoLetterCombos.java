package day24_arrays;

public class TwoLetterCombos {
	public static void main(String[] args) {
		
		for (char i = 'a' ; i <= 'e' ; i++) {
			for (char x = 'a' ; x <= 'e' ; x++) {
				System.out.println(i+""+x);
			}	
		}	
	}
}
//Write a loop that displays all possible combinations of two letters where
//the letters are 'a' or 'b' or 'c' or 'd' or 'e'
//The combinations should be displayed in ascending alphabetical order:
//	aa
//	ab
//	ac
//	ad
//	ae
//	ba
//	bb
//	..
//	ee