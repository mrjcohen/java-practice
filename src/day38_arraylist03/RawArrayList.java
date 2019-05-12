package day38_arraylist03;

import java.util.ArrayList;

public class RawArrayList {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Saturday");
		list.add("Java Day");
		list.add(1000);
		list.add(234.4);
		list.add(true);
		list.add(false);
		
		System.out.println(list); //automatically calls toString();
		System.out.println(list.toString());
		String allValues = list.toString();
		
		String str = list.get(0).toString();
		
		//Down Casting
		Integer i = (Integer) list.get(2);
		System.out.println(i);
	}
}
