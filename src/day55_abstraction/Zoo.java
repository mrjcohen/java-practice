package day55_abstraction;

public class Zoo {
	public static void main(String[] args) {
		
		//Animal animal = new Animal();
		//Cannot instantiate the type Animal
		
		Cat fluffy = new Cat("Fluffy");
		fluffy.speak();
		
		Dog poochie = new Dog("Rex");
		poochie.setName("poochie");
		poochie.speak();
		poochie.eat();
		
	}	
}
