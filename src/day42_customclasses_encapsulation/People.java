package day42_customclasses_encapsulation;

public class People {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("jon");
		System.out.println(p1.getName());
		
		p1.setAge(34);
		System.out.println(p1.getAge());
		
	}
}
