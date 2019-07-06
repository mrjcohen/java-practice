package day45_encapsulation_practice;
import java.util.*;
public class Canvas {
	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.setName("Java Programming");
		
		List<String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasyl");
		javaTeachers.add("Murodil");
		javaTeachers.add("Marufjon");
		javaTeachers.add("Muhtar");
		course1.setTeachers(javaTeachers);
		
		List<String> javaStudents = new ArrayList<>();
		javaStudents.add("Burak");
		javaStudents.add("Roman");
		javaStudents.add("Gulnar");
		javaStudents.add("Ethem");
		javaStudents.add("Sung");
		course1.setStudents(javaStudents);
		
		System.out.println(course1.toString());
		
		
		course1.addTeacher("Maria");
		course1.addStudent("Ekaterina");
		
		if (course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher");
		} else {
			System.out.println("Maria is not a teacher");
		}
		
		if (course1.getStudents().contains("Ekaterina")) {
			System.out.println("Ekaterina is a student");
		} else {
			System.out.println("Ekaterina is not a student");
		}
		
		
		course1.removeTeacher("Muradil");
		course1.removeStudent("Roman");
		
		if (!course1.getTeachers().contains("Muradil")) {
			System.out.println("Muradil removed successfully");
		} else {
			System.out.println("Muradil is still a teacher");
		}
		
		if (!course1.getStudents().contains("Roman")) {
			System.out.println("Roman removed successfully");
		} else {
			System.out.println("Roman is still a student");
		}
		
	}
}
