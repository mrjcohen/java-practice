package day42_customclasses_encapsulation;

import java.util.*;
import java.lang.*;  //this is always imported by compiler by default

public class StringShoestoObject {
	public static void main(String[] args) {
		//split thid data and add to shoes object
		String data = "Bruno Magli,9.5";
		//split using an array
		String[] arrData = data.split(",");
		//create shoes object
		Shoes shoes = new Shoes();
		shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		//shoes.brand = arrData[0];
		//shoes.size = Double.parseDouble(arrData[1]);
		System.out.println(shoes.getShoesData());
		
		
		//Creating a shoe object using scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("What is you brand?");
		String brand = scan.next();
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		
		Shoes myShoes = new Shoes();
		myShoes.setShoesData(brand, size);
		System.out.println(myShoes.getShoesData());
	}
}
