package day38_arraylist03;

import java.util.*;

public class MethodsSummary {
	public static void main(String[] args) {
		//Create an ArrayList
		List<String> list1 = new ArrayList<>();
		//add method to add a value
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		//add method with index: yellow will be placed at index 0
		list1.add(0,"yellow");
		//toString method to print all values in same lime as a string
		System.out.println("ArrayList length: "+list1.toString());
		//size method reutrns number of values in the list
		System.out.println(list1.size());
		//get method returns value from an index
		System.out.println("value at index 3: " + list1.get(3));
		//remove using index removes value from index position
		list1.remove(0);
		System.out.println("list1: " + list1.toString());
		//remove using a value. removes the first occurence of that value
		list1.remove("blue");
		System.out.println("list1: " + list1.toString());
		//set(index,value) replaces certain index with a new value
		list1.set(0, "orange");
		System.out.println("list1: " + list1.toString());
		//indexOf(value). returns index of valuein the list
		System.out.println("index of grey: " + list1.indexOf("grey"));
		System.out.println("index of nonexistent value (green): " + list1.indexOf("green"));
		//isEmpty reutnrs boolean value true if it is empty (size == 0)
		System.out.println("Is list empty? - " + list1.isEmpty());
		System.out.println("Is list empty? - " + (list1.size() == 0));
		//contains(element). returns true if value is present
		System.out.println("Does list contain white? - "+list1.contains("white"));
		
		List<String> list2 = new ArrayList<>();
		//addAll - adds all values from one list to another
		list2.addAll(list1);
		System.out.println("list2: " + list2.toString());
		//contains - check if list has all values of another list
		System.out.println("Does list1 contain everything list 2 does? - " + list1.containsAll(list2));
		//equals(list) - checks if 2 lists are exactly equal
		System.out.println("Are list1 and list2 identical? - " + list1.equals(list2));
		
		list2.add("pink");
		
		//removeAll(list) - removes all matching values from one list to another
		list2.removeAll(list1);
		System.out.println("list2: " + list2.toString());
		//addAll(index,list) - adds a list starting from a fiven index
		list2.addAll(0,list1);
		System.out.println("list2 after list1 addAll starting from index0: " + list2);
		//clear method clears the list
		list1.clear();
		list2.clear();
		System.out.println("both lists clear? - " + (list1.isEmpty() && list2.isEmpty()));

	}
}
