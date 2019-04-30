package day32_methods04;

public class Cooking {
	
	public static void add(String something) {
		System.out.println("Add " + something);
	}
	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + " seconds");
	}
	public static void fry(int minutes) {
		System.out.println("Fry for " + minutes + " minutes");
	}
	public static void boil(int minutes) {
		System.out.println("Boil for " + minutes + " minutes");
	}
	public static void cook(String dish, String ingredients) {
		System.out.println("~~"+dish.toUpperCase()+" "+ " RECIPE~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~"+dish.toUpperCase()+" IS READY~~");
	}
	public static void makePancakes() {
		System.out.println("~~PANCAKES RECIPE~~");
		add("milk, Eggs, Flour, Sugar, Salt,");
		mix(120);
		fry(3);
		System.out.println("~~ENJOY YOUR DELICIOUS PANCAKES~~");
	}
	public static void makePasta() {
		System.out.println("~~ITALIAN PASTA RECIPE~~");
		add("Water, Salt, Oliver Oil");
		boil(2);
		add("Spaghetti Pasta");
		boil(9);
		mix(60);
		add("parmesan cheese, Marinara");
		System.out.println("~~ENJOY YOUR DELICIOUS PASTA~~");
	}
	public static void main (String[] args) {
		
		makePancakes();
		
		System.out.println();
		
		makePasta();
		
		System.out.println();
		
		cook("Omelette","Eggs, Salt, Tomatoes, Green Peppers, Onions");
	}
	
}
