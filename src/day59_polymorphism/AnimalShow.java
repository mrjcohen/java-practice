package day59_polymorphism;

public class AnimalShow {
	public static void main(String[] args) {
		Animal animal = new Animal();
		//polymorphism - Reference Animal &&& Object Tiger, Cheetah, Zebra
		Animal tiger = new Tiger();
		Animal cheetah = new Cheetah();
		Animal zebra = new Zebra();
		
		//talk() from Reference Animal was overidden in the object classes Tiger, Cheetah, Zebra to have their own implementations 
		animal.talk();		//Animal is talking
		tiger.talk();		//Tiger is talking > Roar
		cheetah.talk();		//Cheetah is talking - meow
		zebra.talk();		//Zebra is talking - Zzzzee
		
		
		//We can create an array of reference objects in order to create an array of objects
		Animal[] animals = new Animal[3];
		animals[0] = new Tiger();
		animals[1] = new Cheetah();
		animals[2] = new Zebra();
		
		
		animals[0].talk();
		animals[1].talk();
		animals[2].talk();
	}
}
