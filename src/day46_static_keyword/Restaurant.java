package day46_static_keyword;

public class Restaurant {
	public static void main(String[] args) {
		Dinner Mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner Dad = new Dinner();
		
		System.out.println("total slices: " + Dinner.pizzaSlices); //8
		
		Dad.takeASlice(); //8
		kid.takeASlice(); //7
		Mom.takeASlice(); //6
		
		System.out.println("total slices: " + Dinner.pizzaSlices); //5
		System.out.println("total slices: " + Dad.pizzaSlices);    //5
		
		kid.takeASlice(3); //2
		Dad.takeASlice(2); //0
//		Mom.takeASlice();  //-1
		
		System.out.println("total slices: " + Mom.pizzaSlices);    //0
		System.out.println("total slices: " + Dinner.pizzaSlices); //0
		
	}
}
