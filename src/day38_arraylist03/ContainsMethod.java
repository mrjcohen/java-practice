package day38_arraylist03;

import java.util.ArrayList;

public class ContainsMethod {
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());				//[Jan, Feb, Mar, Apr, May]
		
		ArrayList<String> months = new ArrayList<>(list1); 	//constructor - putting list1 into the new 
														   	//arrayList (months) will duplicate the list
														   	//*Creates a object in heap*
		
		//ArrayList<String> months = list1;				   	//Points to same object in heap memory
	
		System.out.println(months.toString());				//[Jan, Feb, Mar, Apr, May]
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		System.out.println(months.toString());				//[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug]
		
		System.out.println(months.contains("Jan")); //true
		System.out.println(months.contains("Dec")); //false
		
		
		//How to check if Feb is in the second position
		System.out.println(months.indexOf("Feb") == 1);		//true - if list gets cleared code will still run and return -1
		System.out.println(months.get(1).equals("Feb"));	//true - if list gets cleared this method will show out of bounds error
		
		ArrayList<String> month2 = new ArrayList<>(list1);
		System.out.println("Months:" + months.toString());	//Months:[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug]
		System.out.println("Month2:" + month2.toString());	//Month2:[Jan, Feb, Mar, Apr, May]
		
		System.out.println(list1.containsAll(month2));		//true
		
		//Adding a 2nd "Jan" to the month2 list
		month2.add("Jan");
		System.out.println(list1.containsAll(month2));		//true - containsAll doesnt care if there are duplicate values
		
		
	}
}
