package day55_abstraction;

public class ShapeGenerator {
	public static void main(String[] args) {

		Circle circle = new Circle(10);
		System.out.println("Area of Circle:" + circle.calculateArea());
		circle.draw();
		
		Triangle triangle = new Triangle(5,5,5);
		System.out.println("Area of Circle: " + triangle.calculateArea());
		triangle.draw();
		
	}
	

}
