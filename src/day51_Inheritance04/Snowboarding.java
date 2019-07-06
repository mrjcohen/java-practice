package day51_Inheritance04;

public class Snowboarding extends Exercise {

	@Override
	public int perform(int minutes) {
		super.perform(10); //call super class version
		System.out.println("Snowboarding for " + minutes + " minutes");
		return minutes * 7;
	}
	
}
