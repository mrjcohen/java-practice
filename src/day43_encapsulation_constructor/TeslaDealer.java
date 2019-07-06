package day43_encapsulation_constructor;

public class TeslaDealer {
	public static void main(String[] args) {
		
		Tesla tesla = new Tesla();
		
		tesla.setModel("Model Y");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		System.out.println("Model: "+tesla.getModel());
		System.out.println("Range: "+tesla.getRange());
		System.out.println("0to60: "+tesla.getZeroTo60());
		System.out.println("Price: "+tesla.getprice());
		System.out.println("Self Driving: "+tesla.isSelfDriving());
		
		System.out.println(tesla);			   //Also prints toSting automatically
		System.out.println(tesla.toString());  //converts the object data to string
		
		
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());
		
		if(tesla.getZeroTo60() < myTesla.getZeroTo60()) {
			System.out.println(tesla.getModel()+" is faster");
			System.out.println("0to60 speed is: " + tesla.getZeroTo60());
		} else {
			System.out.println(myTesla.getModel()+" is faster");
			System.out.println("0to60 speed is: " + myTesla.getZeroTo60());
		}
		
		buy(tesla);
		buy(myTesla);
		
		
		System.out.println(testDrive("Model S"));
		Tesla testCar = testDrive("Model 3");
		
		
		

	}
	
	public static void buy(Tesla car) {
		System.out.println("purchasing " + car.toString());
	}
	
	public static Tesla testDrive(String model) {
		System.out.println("I would like to test drive " + model);
		System.out.println("Sure, let me build the object and return it");
		Tesla car = new Tesla();
		car.setTeslaInfo(model, 310, 2.5, 95000, false);
		return car;
	}

}
