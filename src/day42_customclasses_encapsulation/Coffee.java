package day42_customclasses_encapsulation;

public class Coffee {
	String name;
	String size;
	double price;
	int calories;
	
	public void getCoffeeInfo() {
		String info = name.toUpperCase()+"   "+size.toUpperCase()+"  $"+price+"  "+calories+" CAL";
		System.out.println(info);
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setSize(String newSize) {
		if(newSize.equalsIgnoreCase("tall") || 
		   newSize.equalsIgnoreCase("venti") ||
		   newSize.equalsIgnoreCase("grande") ) {
			size = newSize;
		} else {
			System.out.println("ERROR: invalid Size");
			size = "unknown";
		}
		
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public void setCalories(int newCalories) {
		calories = newCalories;
	}
	
	public void setCoffeeInfo(String setName, String setSize, double setPrice, int setCalories) {
		name = setName;
		setSize(setSize);			//assigning using another method
		price = setPrice;
		calories = setCalories;
	}
	
}
