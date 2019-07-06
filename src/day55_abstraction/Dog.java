package day55_abstraction;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("woof woof");
	}

	@Override
	public void eat() {
		System.out.println(getName() + " eats");
	}
	
}
