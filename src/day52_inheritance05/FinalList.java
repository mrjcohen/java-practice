package day52_inheritance05;

import java.util.*;

public class FinalList {
	
	public static final String COLOR = "Pink";
	//public -> access modifier ::: final, static -> non-access modifier
	
	public static void main(String[] args) {
		
		final ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("Orange");
		COLORS.add("Grey");
		COLORS.add("White");
		COLORS.add("Blue");
		System.out.println(COLORS.toString());  //OUTPUT: [Orange, Grey, White, Blue]
		COLORS.add("Black");
		System.out.println(COLORS.toString());	//OUTPUT: [Orange, Grey, White, Blue, Black]
		
		//since arrayList is final we cant create a new arraylist object
		//Creates a new ArrayList object named COLORS that is empty
		//COLORS = new ArrayList<>();
		//System.out.println(COLORS.toString());	//OUTPUT: []
		
		
	}

}
