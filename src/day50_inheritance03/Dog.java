package day50_inheritance03;

public class Dog extends Animal 
{
	public void speak() {
		System.out.println("Dog is saying Woof Woof");
	}
	
	public void move(int steps) {
		System.out.println("Dog is moving " + steps + " steps");
	}
}
