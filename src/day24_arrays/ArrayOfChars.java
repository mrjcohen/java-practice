package day24_arrays;

public class ArrayOfChars {
	public static void main(String[] args) {
		
		char[] values = { 'a' , 'b' , 'c' };
			for (char value: values) {
				System.out.println(value);
			}
		//convert strings to array of characters
		String str = "Wooden spoon";
		char[] chars = str.toCharArray();
		//For each loop to print all char in the array
		for (char c: chars) {
			System.out.print(c+"_");
		}
		System.out.println();
		//Prints char array in reverse order
		for (int i = chars.length-1 ; i >= 0 ; i--) {
			System.out.print(chars[i]);
		}
		System.out.println(str);
		
		//TASK: Use a for each loop to print characters with help of array of characters, one by one
		//if character is 'o' , replace it with '*'
		String taskword = "Wooden Spoon";
		char[] word = taskword.toCharArray();
		for (char c: word) {
			if (c == 'o') {
				System.out.print("*");
			} else {
				System.out.print(c);
			}
		}
		

		
	}
}
