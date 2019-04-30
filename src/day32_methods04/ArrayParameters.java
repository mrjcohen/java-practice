package day32_methods04;

public class ArrayParameters {
	public static void printArray(int[] nums) {
		
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}
	public static void print2Arrays(int[] arr1, int[] arr2) {
		if (arr1.length > arr2.length) {
			printArray(arr1);
			printArray(arr2);
		} else {
			printArray(arr2);
			printArray(arr1);
		}
	}
	
	public static void main(String[] args) {
		int[] myArray = {24,32,6,11};
		printArray(myArray);
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = {1,2,3,4,5,6};
		
		print2Arrays(arr1,arr2);
		
		
	}
}
