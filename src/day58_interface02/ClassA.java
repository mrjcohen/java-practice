package day58_interface02;

public class ClassA implements Cloneable {
	
	@Override
	public Object clone() {
		System.out.println("Cloning");
		//any custom code to run when cloning classA object
		return null;
	}
}
