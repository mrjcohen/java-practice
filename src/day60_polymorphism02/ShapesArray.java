package day60_polymorphism02;

//import day59_polymorphism.Shape;
//import day59_polymorphism.Triangle;
import day59_polymorphism.*;
import java.util.*;

public class ShapesArray {
	public static void main(String[] args) {
		
		//Creating a single polymoprphic object
		Shape shape = new Triangle();
		
		shape.draw();
		
		System.out.println(shape.getClass().getName());
		
		//Creating an array of objects with defined objects
		Shape[] shapes = { new Triangle(), new Square(), new Circle(), 
						   new Triangle(), new Square(), new Circle(), };
		//For each loop to draw() all objects in Array
		System.out.println("##### FOR EACH LOOP #####");	
		for (Shape sh : shapes) {
			System.out.println(sh.getClass()); //this method prints out the pacakgeName.className
			System.out.println(sh.getClass().getSimpleName()); //this method prints out className only
			sh.draw();
		}				
		
		//Creating an empty array of objects and then adding objects
		Shape[] shapes2 = new Shape[6];
		shapes2[0] = new Triangle();
		shapes2[1] = new Square();
		shapes2[2] = new Circle();
		//calling draw() method from Array
		shapes[0].draw();
		shapes2[2].draw();
		
		//Creating an empty List of objects
		List<Shape> shapesList = new ArrayList<>();
		shapesList.add(new Triangle());
		shapesList.add(new Square());
		shapesList.add(new Circle());
		shapesList.add(new Triangle());
		shapesList.add(new Square());
		Shape newShape = new Square();   //Adding by creaing a Shape variable
		shapesList.add(newShape);		 // and then adding it to the List
		//Calling draw() method from List
		shapesList.get(0).draw();
		Shape someShape = shapesList.get(1);
		someShape.draw();
		//For each loop to draw() all objects in List
		System.out.println("##### FOR EACH LOOP #####");
		for (Shape shapeItem : shapesList) {
			System.out.println(shapeItem.getClass().getSimpleName().toUpperCase());
			shapeItem.draw();
		}
		//For loop to draw() all objects in List
		System.out.println("##### FOR LOOP #####");
		for (int i = 0 ; i < shapesList.size() ; i++) {
			System.out.println(shapesList.get(i).getClass().getSimpleName().toUpperCase());
			shapesList.get(i).draw();
		}
		
		//Creating an empty ArrayList of objects
		ArrayList<Shape> shapesArrayList = new ArrayList<>();
		shapesArrayList.add(new Triangle());
		shapesArrayList.add(new Square());
		shapesArrayList.add(new Circle());
		
		
		
		
		
	}
}
