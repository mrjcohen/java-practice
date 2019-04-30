package day24_arrays;

import java.util.Arrays;

public class SumOfTheNumbers {
	public static void main(String[] args) {
		//lets create an array of integers with a length of 3
		int [] numbers = new int[3];
		//first value in array
		numbers[0] = 25;
		//second value in array
		numbers[1] = 10;
		//third value in array
		numbers[2] = 20;
		//[I@4d591d15 this is a hash code
		System.out.println(numbers);
		//[5, 10, 20] this prints out the array as a String
		System.out.println(Arrays.toString(numbers));
		//calculate the sum of all elements in the given array using a for loop
		int sum = 0;
		for (int i = 0 ; i < numbers.length ; i++) {
			sum += numbers[i];
		}
		//25 + 10 + 20 = 55
		System.out.println(sum);
		//find largest value in an array
		int max = Integer.MIN_VALUE;  //  = -2147483648 -> Lowest value an int can store
		for (int i = 0 ; i < numbers.length ; i++) {
			if (numbers [i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Max Value: "+max);
		//find minimum value in an array
		int min = Integer.MAX_VALUE;
		for (int i = 0 ; i < numbers.length ; i++) {
			if (numbers [i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("Min Value: "+min);
		
	}
}
