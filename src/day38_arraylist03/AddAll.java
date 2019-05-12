package day38_arraylist03;

import java.util.*;

public class AddAll {
	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<>();
		l1.add("java");
		l1.add("python");
		
		List<String> l2 = new ArrayList<>();
		l2.add("C#");
		l2.add("C++");
		
		System.out.println(l1);			//[java, python]
		System.out.println(l2);			//[C#, C++]
		
		//adding all values in l1 to l2 can be done in two ways
		
		//Either with a loop or...
//		for (String value : l1) {
//			l2.add(value);
//		}
//		System.out.println(l2);
		
		//With addAll
		l2.addAll(l1);
		System.out.println(l2);			//[C#, C++, java, python]
		
		l2.addAll(l1);
		System.out.println(l2);			//[C#, C++, java, python, java, python]
		
		l1.addAll(l2);
		System.out.println(l1);			//[java, python, C#, C++, java, python, java, python]
		
		
	}
}




