package day55_abstraction;

public abstract class Shape {
	
	String name;
	double area;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public abstract double calculateArea();
	
	public abstract void draw();
	
	
	
	

}
/*
1,Create a Shape abstract class

2,create instance fields: name, area (double);

3,create 2 abstract method as below :
calculateArea() return double, no arg
draw() void 

4,create one constructor that set name-value

5,Create Circle and Triangle Concrete class of Shape

5.1,create no arg constructor and call super class's 
one arg constructor
for Circle add 1 arg to set radius,Triangle 3 args 
set length
6,In Circle class add radius field. 
and use this field to calculate your area in your calculate are method
7,in Triangle class add leng1,leng2,leng3 and calculate your area according to the each side of triangle. 
9, Implement the abstract methods in both class 
to provide detail
*/