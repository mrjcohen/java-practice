package day49_inheritance02;

//Factory is a non-subclass that is in same packaged
public class Factory {
	public static void main(String[] args) {
	
		Device dv = new Device();
		dv.brand = "LG";
		dv.model = "3300";
		dv.price = 1000;
		
		//Private not visible here
		//dv.country = "USA";
		
	}
}
