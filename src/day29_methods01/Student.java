package day29_methods01;

public class Student {
	public static void main(String[] args) {
		
		
		study();				//"Student is studying"
		study();				//"Student is studying"
		sayHello();				//"Hello Friends!"
								//"How are you today?"
		code();					//"Inside code method"
								//"Student is coding java"
	}
	//outside the main method
	
	
	public static void study() {
		System.out.println("Student is studying");
	}
	
	public static void sayHello() {
		System.out.println("Hello Friends!");
		System.out.println("How are you today?");
	}
	
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding java");
	}
	
}

