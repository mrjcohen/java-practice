package day61_polymorphism03;

import day60_polymorphism02.*;

public class DownCasting {
	public static void main(String[] args) {
		
		AppleDevice appDev = new IPad();
		//appDev can access use() method, startingPrice variable
		appDev.use();
		//appDev.draw(); from IPad is not accessable
		
		//We can use casting to make .draw() method accessable
		IPad ipad = (IPad)appDev; //object is same but reference is changed
		
		ipad.draw();
		ipad.use();
		
		
		//Two ways of casting
		
		//1 - Casting with a a new reference variable (not a new object)
		IPad ipad1 = (IPad)appDev;
		ipad1.draw();
		
		
		//2 - Casting without creating a new variable
		((IPad)appDev).draw();
		
		
		
		
		
		
		AppleDevice dev2 = new Mac();
		
		//1 - using another reference variable
		Mac mac = (Mac)dev2;
		mac.code();
		
		//2 - cast and call in a single statement (without Creating a new ref variable)
		((Mac)dev2).code();
		
		
		//String str = (String) dev; not related with inheritance
		
		//casting with numbers
		double d = 123.45;
		int j = (int)d;
		
		
	}
}
