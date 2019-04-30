package day27_arrays05;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
		
		
		
		//In order do use Arrays.binarySearch, the array must be sorted
		int nums[] = {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(nums, 7)); //Index 2
		System.out.println(Arrays.binarySearch(nums, 55)); //Index 4
		System.out.println(Arrays.binarySearch(nums, 5)); //Index -2
		
		int i = Arrays.binarySearch(nums, 10);
		System.out.println(i);	//Index 3
		
		
		
		
		//HERE IS WHAT HAPPNES WHEN YOU DONT SORT FIRST. RETURNED INDEX ARE WRONG
		int nums1[] = {6,4,7,55,10};
		System.out.println(Arrays.binarySearch(nums1, 7)); //Index 2
		System.out.println(Arrays.binarySearch(nums1, 55)); //Index 3
		System.out.println(Arrays.binarySearch(nums1, 5)); //Index -1
		
		int e = Arrays.binarySearch(nums1, 10);
		System.out.println(e);	//Index -4
		

	}
}
