package day36_wrapperclasses_arraylistintro;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		
		//declare arrayList called languages
		ArrayList<String> languages = new ArrayList<>();
		
		//add values
		languages.add("Java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Russian");
		languages.add("Azerbaijani");
		languages.add("Ukranian");
		languages.add("Turkish");
		
		
		//print out size of arrayList
		System.out.println(languages.size());

		//removing a value
		languages.remove(0);
		languages.remove("English");
		
		//Print arrayList converted to String
		System.out.println(languages.toString());
		
		
	}
}
