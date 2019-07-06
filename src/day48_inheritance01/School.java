package day48_inheritance01;

public class School {
	public static void main(String[] args) {
		
		Person person = new Person();
		//Using inheritence we can extend Person class to Student
		Student student = new Student();
		
		person.name = "Obama";
		person.age = 57;
		person.age = 'm';
		
		student.name = "Roman";
		student.age = 30;
		student.gender = 'm';
		
		person.eat("steak");
		student.eat("grechka");
		
		person.sleep(8);
		student.sleep(7);
		
		Student student2 = new Student();
		student2.name = "Orhan";
		student2.age = 40;
		student2.gender = 'm';
		student2.studentID = 404;
		student2.clazz = "Agile Scrum";
		
		student2.code("Java");
		student2.attendClass();
		student2.eat("kebab");
		student2.walk();
		
		student.code("python");
		student.attendClass();
	}
}
