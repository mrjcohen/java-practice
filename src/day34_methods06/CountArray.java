package day34_methods06;

import java.util.Random;

public class CountArray {
	public static int findOccurences (int[] array, int value) {
		
		int count = 0;
		
		for (int num : array) {
			if (num == value) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int[] getArray () {
		int[] retArray = {45,42,11,545,1000};
		return retArray;
	}
	
	public static int[] getRandomArray(int size) {
		Random random = new Random();
		int[] array = new int[size];
		for (int i = 0 ; i < size ; i++) {
			array[i] = random.nextInt(101);
		}
		return array;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = {2,3,4,5,5,6,6,6,7,5,5,12};
		
		int fives = findOccurences(nums,5);
		int sixes = findOccurences(nums,6);
		
		System.out.println("There are "+fives+" fives in the array");
		System.out.println("There are "+sixes+" sixes in the array");
		
		
		
		if (fives > 0) {
			System.out.println("We have 5s");
		} else {
			System.out.println("We have no 5s");
		}
		
		
		
		if (findOccurences(nums,2) > 0) {
			System.out.println("We have 2s");
		} else {
			System.out.println("We have no 2s");
		}
		
		
		findOccurences(new int[] {10,20,20,30,55,22} , 20);
		
		
		
		
		
	}
}
