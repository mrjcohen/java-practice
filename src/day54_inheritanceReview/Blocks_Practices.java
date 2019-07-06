package day54_inheritanceReview;

public class Blocks_Practices {
	
	static String names;
	
	static {
		System.out.println("Static block");
		names = "John";
	}
	
	
	{
		System.out.println("init block");
		names = "Aron";
	}
	
	public Blocks_Practices() {
		System.out.println("constructor");
		names = "Murodil";
	}
	
	static int num1=10;
	
	public static void main(String[] args) {
		System.out.println(names);
		
		
		Blocks_Practices obj = new Blocks_Practices();
		obj.num1=20;
		System.out.println(names);
		
		Blocks_Practices obj2 = new Blocks_Practices();
	
		System.out.println(obj2.num1);
		
	}

}
