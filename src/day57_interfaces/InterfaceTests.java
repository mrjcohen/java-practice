package day57_interfaces;

public class InterfaceTests {
	public static void main(String[] args) {
		
		//Electric e = new Electric();   <-- wont work (cannot create objects of interfaces)
		Tesla t = new Tesla();
		BMWi8 i8 = new BMWi8();
		Vehicle v = new Vehicle();
		
		
		t.charge();
		i8.charge();
		
		t.drive();
		t.selfDrive();
		
		v.drive();
		
		
		Electric el2 = new Tesla();  //This is polymorphism. We will talk about more later
		
		
		
		Cat cat = new Cat();
		
		cat.play();
		cat.keepAsPet();
		cat.respond();
		Pet.feed("dry food"); ///static methods in interfaces are not inherited to other classes
		System.out.println(Pet.FRIENDLY);
		
		
		
	}
}
