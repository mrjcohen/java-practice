package day38_arraylist03;

import java.util.*;

public class ContainsAll {
	public static void main(String[] args) {
		
		List<Integer> nums1 = new ArrayList<>();
		nums1.add(10);nums1.add(20);nums1.add(30);nums1.add(40);
		
		List<Integer> nums2 = new ArrayList<>();
		nums2.add(20);nums2.add(10);nums2.add(40);nums2.add(30);
		
		if (nums1.containsAll(nums2)) {														//true
			System.out.println("nums1 contains all the numbers that nums2 does");			//<---
		} else {
			System.out.println("nums1 DOES NOT contains all the numbers that nums2 does");
		}
		
		System.out.println(nums2.containsAll(nums1));
		
		System.out.println(nums1.containsAll(nums2) && nums2.containsAll(nums1)); 			//true
		
		
		
		
		
		List<String> planA = new ArrayList<>();
		planA.add("java");
		planA.add("replit");
		planA.add("ping pong");
		planA.add("food");
		planA.add("run");
		planA.add("sleep");
		
		List<String> planB = new ArrayList<>();
		planB.add("food");
		planB.add("run");
		planB.add("sleep");
		planB.add("java");
		planB.add("ping pong");
		planB.add("replit");
		
		//How to check that both list have the same values in them regardless of order
		if (planB.containsAll(planA) && planA.containsAll(planB)) {
			System.out.println("Both lists have the same values in them regardless of order");
		} else {
			System.out.println("Both lists do not share the same values");
		}

		
		
	}
}
