package day51_Inheritance04;

public class Swimming extends Exercise {

	@Override
	public int perform(int minutes) {
		System.out.println("Swimming");
		return minutes * 11;
	}
}
