package day39_arraylist04;

import java.util.*;

public class CustomListMethods {
	public static void printList(ArrayList<Integer> nums) {
		for (Integer n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public static double sumList(List<Double> dlist) {
		double sum = 0.0;
		for (Double d : dlist) {
			sum += d;
		}
		return sum;	
	}
	
	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> newList = new ArrayList<>();
		for (int i = 1 ; i <= size ; i++) {
			newList.add(i);
		}
		return newList;
	}
	
	public static List<Integer> getRandomList(int size) {
		Random rand = new Random();
		List<Integer> newList = new ArrayList<>();
		for (int i = 0 ; i <= size ; i++) {
			newList.add(rand.nextInt(101));
		}
		return newList;
	}
	
	public static ArrayList<Integer> convertToIntList(ArrayList<String> list) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(String s : list) {
			numList.add(Integer.parseInt(s));
		}
		return numList;
	}
	
	public static void main(String[] args) {
		//Prepare an arrayList to pass to printList method
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);numsList.add(10);numsList.add(7);numsList.add(8);
		numsList.add(8);numsList.add(3);numsList.add(4);numsList.add(8);
		
		//Call the printList method
		printList(numsList);
		
		
		//Prepare an arrayList to pass to sumList method
		List<Double> doubleList = new ArrayList<>();
		doubleList.add(44.2);doubleList.add(11.3);doubleList.add(22.2);
        doubleList.add(55.1);doubleList.add(66.4);
		
        //Call the sumList method
        double sum = sumList(doubleList);
      	System.out.println(sum);
        
        
       
		
		//Call the getList method
		System.out.println(getList(7).toString());
		//assigning getList method output to a new ArrayList called newList
		ArrayList<Integer> newList = getList(5);
		System.out.println(newList);

		//Call the getRandomList method
		List<Integer> rList = getRandomList(5);
		Collections.sort(rList);
		System.out.println(rList);
		
		
		
		//Prepare an arrayList to pass to convertToIntList method
		ArrayList<String> StringNums = new ArrayList<>();
		StringNums.add("123");StringNums.add("33");StringNums.add("128");
		StringNums.add("3");StringNums.add("234");StringNums.add("88");
		
		//Call the convertToIntList method
		ArrayList<Integer> converted = convertToIntList(StringNums);
		System.out.println(converted);
		
		
		
		
		
		
	}
}
