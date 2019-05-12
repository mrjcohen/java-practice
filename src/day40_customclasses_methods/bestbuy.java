package day40_customclasses_methods;

public class bestbuy {
	public static void main(String[] args) {

		// We need to create an object to use object/instance variabels
		CellPhone cell1 = new CellPhone();

		System.out.println(cell1.brand); // null
		System.out.println(cell1.screenSize); // 0.0
		System.out.println(cell1.color); // null
		System.out.println(cell1.price); // 0.0

		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 76.16;

		System.out.println("Brand: " + cell1.brand); // Brand: Nokia 6300
		System.out.println("Screen Size: " + cell1.screenSize); // Screen Size: 2.0
		System.out.println("Color: " + cell1.color); // Color: Silver
		System.out.println("Price: $" + cell1.price); // Price: $76.16

		
		
		CellPhone cell2 = new CellPhone();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.color = "Blue";
		cell2.price = 39.22;
		
		System.out.println("####### CELL 2 VALUES ########");
		System.out.println("Brand: " + cell2.brand); // Brand: Nokia 6300
		System.out.println("Screen Size: " + cell2.screenSize); // Screen Size: 2.0
		System.out.println("Color: " + cell2.color); // Color: Silver
		System.out.println("Price: $" + cell2.price); // Price: $76.16
		
		
		System.out.println("###### CALLING METHODS #######");
		cell1.call();
		cell1.message();
		
		cell2.call();
		cell2.message();
	}
}
