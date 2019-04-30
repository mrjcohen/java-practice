package day23_loops_and_arrays;

public class arrays1 {
	public static void main(String[] args) {
		//Declaring and int array with 3 values
		int [] numbers = new int[3];
								
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		
		//Assigning values to the array
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;
		
		//Printing out array values
		System.out.println(numbers[0]);	//5
		System.out.println(numbers[1]);	//7
		System.out.println(numbers[2]);	//10
		
		
		//Using a for loop to print all values in the array
		for (int i = 0; i <=2 ; i++ ) {
			
			System.out.println(numbers[i]);
		}
		
		
		
	}
}
