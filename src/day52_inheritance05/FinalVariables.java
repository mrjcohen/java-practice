package day52_inheritance05;

public class FinalVariables {
	
	
	public final int ROADSTER_MAX_RANGE = 610; //1 - FINAL VARIABLE CAN BE INITIALIZED DIRECTLY
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	
	public static final String COMPANY_NAME = "CyberTek"; //1 - FINAL STATIC CAN BE INITIALIZED DIRECTLY
	public static final String ADMIN_USER_NAME;
	
	static {
		ADMIN_USER_NAME = "admin@gmail.com";             //2 - FINAL STATIC VARIABLE CAN BE INITIALIZED IN AN INIT BLOCK
		}
	
	
	//final can be useful when you want to restrict the use of a variable so its reserved for specific spelling (so January will always be spelled the same way)
	public final String JAN = "January";
	
	
	
	public FinalVariables() {
		MODEL_3_MAX_SPEED = 180;               //2 - FINAL VARIABLE CAN BE INITIALIZED IN THE CONSTRUCTOR
	}
	
	{
		MODEL_X_PASSENGERS = 7;                //3 - FINAL VARIABLE CAN BE INITIALIZED IN AN INIT BLOCK
	}
	
	
	public static void main(String[] args) {
		
		
		final int MAX_PASSENGERS_COUNT = 5;
		//MAX_PASSENGERS_COUNT = 10;
		System.out.println(MAX_PASSENGERS_COUNT);
		
		final int SSN;
		SSN = 312343532;
		//SSN++;
		
		
		
		FinalVariables finalVars = new FinalVariables();
		
		System.out.println("Max range for roadster: "+finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max speed: "+finalVars.MODEL_3_MAX_SPEED);
		System.out.println("Model X passengers: "+finalVars.MODEL_X_PASSENGERS);
		
		System.out.println("Company Name: "+ COMPANY_NAME);
		System.out.println("Company Name: "+ FinalVariables.COMPANY_NAME);
		System.out.println("Admin user name: "+ ADMIN_USER_NAME);
		System.out.println("Admin user name: "+ FinalVariables.ADMIN_USER_NAME);
		
		
		
		
	}
}
