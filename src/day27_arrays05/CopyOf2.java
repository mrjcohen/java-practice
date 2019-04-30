package day27_arrays05;

import java.util.Arrays;

public class CopyOf2 {
	public static void main(String[] args) {
		int[] nums1 = {34,56,23,1,55};
		int[] nums2 = Arrays.copyOf(nums1, nums1.length+2);
		System.out.println(Arrays.toString(nums1));	//[34, 56, 23, 1, 55]
		System.out.println(Arrays.toString(nums2));	//[34, 56, 23, 1, 55, 0, 0]
		
		nums2[5] = 100;
		nums2[6] = 200;
		System.out.println(Arrays.toString(nums2));	//[34, 56, 23, 1, 55, 100, 200]
		
		
		int[] nums3 = Arrays.copyOfRange(nums1, 1, 4);
		System.out.println(Arrays.toString(nums3)); //[56, 23, 1]
		
		
		
		int[] brandNew = {34,23,54,23};
		System.out.println("Length before: "+brandNew.length);
		brandNew = Arrays.copyOf(brandNew,brandNew.length+5);
		System.out.println("Length before: "+brandNew.length);
		
	}
}
