package day59_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Store {
	public static void main(String[] args) {
		
		HairSpray hp = new HairSpray();
		hp.catchFire();
		
		//interface    -   implenting class/sub class
		Flammable hairSp = new HairSpray();
		hairSp.catchFire();
		
		//interface - implenting class/sub class
			//Flammanle = referene type/data type
			//pTank = reference variable name
			//PropameTank = object type
		Flammable pTank = new PropaneTank();
		pTank.catchFire();
		
		
		
		Flammable item;
		item = new HairSpray();
		item = new PropaneTank();
		
		
		
		
		List<Flammable> items = new ArrayList<>();
		
		
		
	}
}
