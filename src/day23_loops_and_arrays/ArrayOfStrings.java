package day23_loops_and_arrays;

public class ArrayOfStrings {
	public static void main(String[] args) {
		
		//Create an array of strings, with size 5
		//if array has 5 items, and we are trying to get item under index 5 (indexes starts from 0), we will get
	
		String [] names2 = {"Jon" , "Bill" , "Tim" , "Jack" , "Bob"};
		System.out.println(names2.length);
		
		String[] fruits = new String[] {"apple" , "bannana","orange"};
		
		//for each loop stand for collection of data
		//we need specify data type, variable name : out collection of data
		//for each loop or enhanced loop
		
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
		
	
		
		
	}

}
