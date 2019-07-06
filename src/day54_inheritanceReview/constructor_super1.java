package day54_inheritanceReview;

class Animals {
	public Animals() {
		System.out.println("Tiger");
	}
}

public class constructor_super1 extends Animals{
	public constructor_super1() {
		//super(); <- this is in every constructor by default without having to put it in 
	}
	public constructor_super1(int a) {
		//super(); <- this is in every constructor by default without having to put it in 
	}
	public constructor_super1(double a) {
		//super(); <- this is in every constructor by default without having to put it in 
	}
	
	public static void main(String[] args) {
		new constructor_super1(10.5);
	}
}
