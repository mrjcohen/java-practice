package day06_operators2;

public class OperatorsPrecedence {
	
	public static void main(String[] args) {
		
		
		System.out.println("Hello " + 6 + 10); 		//Hello 610
		System.out.println("Hello " + (6 + 10));	//Hello 16
		System.out.println(6 + 10 + "Hello ");		//16Hello 
		
	}

}
