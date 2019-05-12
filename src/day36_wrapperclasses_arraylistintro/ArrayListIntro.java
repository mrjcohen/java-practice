package day36_wrapperclasses_arraylistintro;

import java.util.ArrayList;

public class ArrayListIntro {
	public static void main(String[] args) {
		//Create an arraylist
		String[] namesArray = new String[5];
		ArrayList<String> names = new ArrayList<>();
		
		
		int[] numsArray = new int[5];
		//ArrayList<int> nums = new ArrayList<>();     Does not work because arraylists only take object types
		ArrayList<Integer> nums = new ArrayList<>(); //You can use Integer instead of int
		
		//assign values into arraylist
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		names.add("Maria");
		
		nums.add(100);
		nums.add(99);
		nums.add(656);
		nums.add(8566);
		nums.add(new Integer("100")); 	
		nums.add(Integer.valueOf("100"));
	
		//Read from arrayList
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		
		//Getting number of values in ArrayList
		System.out.println(names.size());
		
		
	}
}
