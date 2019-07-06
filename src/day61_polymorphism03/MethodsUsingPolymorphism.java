package day61_polymorphism03;

import java.util.Scanner;

import day49_inheritance02.TV;
import day57_interfaces.Tesla;
import day60_polymorphism02.*;

public class MethodsUsingPolymorphism {
	
	//Since parameter is AppleDevice: you can create any referene 
	// object that is a subclass of AppleDevice
	public static void purchase(AppleDevice ap) {
		System.out.println("Purchasing " + ap.getClass().getSimpleName() );
	}
	
	//Object is a parent of ALL classes in java so this will work with any class
	public static void givemeAnyObject(Object object) {
		System.out.println("You gave me " + object.getClass().getSimpleName());
	}
	
	//Write a method buildAppleDevice() that ruturns and AppleDevice
	public static AppleDevice buildAppleDevice() {
		
		//Option 1
//		AppleDevice dev = new Mac();
//		return dev;
		
		//Option 2
		return new Mac();
	}
	
	//polymorphic return type
	public static AppleDevice buildDevice(String type) {
		
		if (type.equals("ipad")) {
			return new IPad();
		} else if (type.equals("mac")) {
			return new Mac();
		} else if (type.equals("applewatch")) {
			return new AppleWatch();
		} else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		//call method and create object at the same time
		purchase(new IPad()); //AppleDevice ap = new Mac();
		
		//create object first and then call
		AppleDevice mac = new Mac();
		purchase(mac);
		
		
		
		//Object is the parent of any class in java
		givemeAnyObject(new String("hi"));
		givemeAnyObject(new Scanner(System.in));
		givemeAnyObject(new TV());
		givemeAnyObject(new Tesla()); //from day57
		givemeAnyObject(55); //autoboxing to integer
		
		int n = 33;
		givemeAnyObject(n);
		
		AppleDevice dev3 = buildAppleDevice();
		
		((IPad)buildAppleDevice()).draw();
		
		AppleDevice dev4 = buildDevice("ipad");	
	}
}
