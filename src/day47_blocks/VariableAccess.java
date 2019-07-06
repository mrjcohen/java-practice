package day47_blocks;

public class VariableAccess {
	
	//instance variable
	int myInstanceVar = 40;
	
	//static variable
	static int myStaticVariable = 55;
	
	public static void main(String[] args) {
		
		  //main method is static so it can only call a static variable
		  //System.out.println(myInstanceVar); <- this method is non-static 
		  System.out.println(myStaticVariable);
		  
		  //You can also access the static variable through the class (Static way)
		  System.out.println(VariableAccess.myStaticVariable);
		  
		  //in order to access the non-static variable you need to create an object
		  VariableAccess v = new VariableAccess();
		  System.out.println(v.myInstanceVar);
		  System.out.println(v.myStaticVariable);
		  	
	}
}
