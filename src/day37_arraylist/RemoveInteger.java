package day37_arraylist;

import java.util.ArrayList;

public class RemoveInteger {
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		//3 ways to check if its empty
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size() == 0);
		
		nums.add(4);
		nums.add(1);
		nums.add(443);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		//removes the 5th index and not the number
		System.out.println(nums);
		nums.remove(5);
		System.out.println(nums);
		
		
		
		//removes the value of 5 from the arrayList
			//Two Ways to do this
		Integer n1 = new Integer(5);
		Integer n2 = Integer.valueOf(5);
		
		
		System.out.println(nums);
		nums.remove(n1);   // or use n2
		System.out.println(nums);
	
		
		
	}
}
