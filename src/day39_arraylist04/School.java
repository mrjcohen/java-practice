package day39_arraylist04;

public class School {
	public static void main(String[] args) {
		//create object from custom student class
		//As long as class is in same package,no 
		// need to point to it
		Student student = new Student();
		student.name = "Jon";
		student.age = 34;
		student.subject = "Java";
		
		System.out.println("Name: " + student.name); //Name: Jon
		System.out.println("Age: " + student.age); //Age: 34
		System.out.println("Subject: " + student.subject); //Subject: Java

		
	
		Student student2 = new Student();
		student2.name = "Cleetus";
		student2.age = 33;
		student2.subject = "Selenium";
		
		System.out.println("Name: " + student2.name); //Name: Cleetus
		System.out.println("Age: " + student2.age); //Age: 33
		System.out.println("Subject: " + student2.subject); //Subject: Selenium

		
		
		
		
		
		
		
	}
}
