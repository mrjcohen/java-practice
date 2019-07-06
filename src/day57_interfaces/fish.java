package day57_interfaces;

public class fish implements Pet {

	@Override
	public void keepAsPet() {
		System.out.println("Fish is kept in fish tank with water/oxygen");
	}
}
