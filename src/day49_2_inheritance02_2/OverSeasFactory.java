package day49_2_inheritance02_2;

//Non Sub-Class in different package
//Must import package
import day49_inheritance02.Device;

public class OverSeasFactory {
	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand = "Samsung";
		
		//Protected is not visible here
		//dv.model = "3200";
		
		//Default is not visible here
		//dv.price = 3242;
		
		//Private not visible here
		//dv.country = "El Salvador";
	}
}
