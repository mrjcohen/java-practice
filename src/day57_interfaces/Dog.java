package day57_interfaces;

public class Dog implements Pet, Callable {

	@Override
	public void respond() {
		System.out.println("Dog is resonding woof-woof");
		
	}

	@Override
	public void keepAsPet() {
		System.out.println("Dog is keepingin the house or outside");
		
	} 
	
	

}
