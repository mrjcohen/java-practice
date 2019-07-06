package day54_inheritanceReview;

class example1{
	public example1(int a) {
		System.out.println("Contructor 1");
	}
	
	public example1(boolean a) {
		this(200);							//to call another constructor you can use this()
	}
	
	public example1(float a) {
		this(true);
	}
	
	public example1(char a) {
		this(20f);
	}
	
	public void method() {					//methods can call themselves but constructors cant
		method();
	}
	
}


public class Constructor {
	public static void main(String[] args) {
		
		example1 obj = new example1(9);
	}
}
