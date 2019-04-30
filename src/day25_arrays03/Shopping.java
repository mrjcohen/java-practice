package day25_arrays03;

public class Shopping {
	public static void main(String[] args) {
		String[] products = {"Timberland Shoes","H&M Shirt","Swatch Watch Watch","Gucci Bag","Adidas Socks"};
		double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int[] itemsId = {12345, 12346, 12347, 12348, 12349};
		System.out.println("*******************");
		//Print count of products
		int prodCount = itemsId.length;
		System.out.println("Item list is " +prodCount);
		System.out.println("*********Check that each array has the same array length**********");
		//Check that each array has the same array length
		if (products.length == prices.length && prices.length == itemsId.length) {
			System.out.println("Shopping List looks good");
		} else {
			System.out.println("Something is wrong with the shopping list");
			return;
		}
		System.out.println("********Print all products,with prices and item ID with for loop***********");
		//Print all products,with prices and item ID with for loop
		for (String p : products) {
			System.out.println(p);
		}
		System.out.println("********Print itemsId in reverse order using a loop***********");
		//Print itemsId in reverse order using a loop
		for (int i = itemsId.length - 1 ; i >= 0; i--) {
			System.out.println(itemsId[i]);
		}
		System.out.println("**********Print all products,with prices and item ID with for loop*********");
		//Print all products,with prices and item ID with for loop
		double totalPrice = 0;
		for (int i = 0 ; i < prodCount; i++) {
			System.out.println("Item "+(i+1)+": "+itemsId[i]+" - "+products[i]+" - $"+prices[i]);
			totalPrice += prices[i];
		}
		System.out.println("Total Price: $"+totalPrice);
		System.out.println("**********Find the most expensive item in your list and print it as a report*********");
		//Find the most expensive item in your list and print out ID as a report
		int maxIndex = 0;
		double maxPrice = 0;
		for (int i = 0 ; i < prices.length; i++) {
			if (prices[i] > maxPrice) {
				maxPrice = prices[i];
				maxIndex = i;
			}
		}
		System.out.println(itemsId[maxIndex]+ " - " +products[maxIndex]+ " - $" + maxPrice);
	}
}
