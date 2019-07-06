package day60_polymorphism02;

import day59_polymorphism.*;

public class InstanceOfOperator {
	
	public static void main(String[] args) {
		
		Shape shape = new Square();
		
		System.out.println(shape.getClass().getName());				//day59_polymorphism.Square
		System.out.println(shape.getClass().getSimpleName());		//Square
		
		
		
		if(shape.getClass().getSimpleName().equals("Triangle")) {
			System.out.println("It is a triangle");
		} else if (shape.getClass().getSimpleName().equals("Circle")) {
			System.out.println("It is a Cirlce");
		} else if (shape.getClass().getSimpleName().equals("Square")) {		//It is a Square
			System.out.println("It is a Square");
		}
				
			
		System.out.println(shape instanceof Square);	//false
		System.out.println(shape instanceof Circle);	//false
		System.out.println(shape instanceof Triangle);	//true
			
		System.out.println(shape instanceof Shape);		//true - because the parent constuctor is run when a child object is created
		System.out.println(shape instanceof Object); 	//true
		
		
		if(shape instanceof Triangle) {
			System.out.println("It is a triangle");
			shape.draw();
		} else if (shape instanceof Circle) {
			System.out.println("It is a Cirlce");
			shape.draw();
		} else if (shape instanceof Square) {			//  It is a Square
			System.out.println("It is a Square");		//  ~~~~~~~~~~~
			shape.draw();								//  ~         ~
		}												//  ~         ~
														//  ~         ~
														//  ~         ~
														//  ~~~~~~~~~~~


		//Counting how many of each types of objects there are
		Shape[] shapes = { new Triangle(), new Square(), new Circle(), 
				   new Triangle(), new Square(), new Circle(), };
		
		int circles = 0, squares = 0, triangles = 0;
		
		for (Shape s : shapes) {
			if (s instanceof Triangle) {
				triangles++;
			} else if (s instanceof Circle) {
				circles++;
			} else if (s instanceof Square) {
				squares++;
			}
		}
		
		System.out.println("Triangles: " + triangles + 	//		Triangles: 2
						"\n" + "Circles: " + circles + 	//		Circles: 2
						"\n" + "Squares: " + squares);	//		Squares: 2
																														
																														
																														
		
		
	}
}
