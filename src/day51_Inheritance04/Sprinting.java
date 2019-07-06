package day51_Inheritance04;

public class Sprinting extends Running {

	@Override
	public int perform(int minutes) {
		System.out.println("Sprinting");
		return minutes * 20;
	}	
}
