package day41_customclasses02;

import java.util.*;


public class WarmUpWithList {
	public static List<Integer> DoubleTheList(List<Integer> nums) {
		
		for (int i = 0 ; i < nums.size() ; i++) {
			nums.set(i , nums.get(i) * 2);
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		
		myList.add(5);
		myList.add(4);
		myList.add(10);
		DoubleTheList(myList);
		System.out.println(myList);
		
		List<Integer> newList = DoubleTheList(myList);
		System.out.println(newList);
		
		
	}
}
