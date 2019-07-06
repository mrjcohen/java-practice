package day54_inheritanceReview;

class parent {
	static int num1;		//class variable		- inheritable
	int num2;							//instance variable - inheritable
	
	public void method1() {			//instance mehtod - inheritable
		System.out.println("Instance Method");
	}
	
	public static void method2() {  		//static method - inheritable
		System.out.println("Static Method");
	}
	
	private void method3() {							// private method - not inheritable, not visible outside class
		System.out.println("Private instance method");
	}
	
	parent() { 								//constructor - not inheritable
		System.out.println("Constructor");
	}
	
	static {										//static block - belongs to the class - inheritable
		System.out.println("Static block");
	}
	
	
	{												//init block - blongs to the object - inheritable
		System.out.println("Instance block");
	}
	
	
	
	
}


public class InheritanceReview extends parent{
				//sub					//parent
	
	public static void main(String[] args) {
		System.out.println(num1);
		System.out.println(new InheritanceReview().num2);
		System.out.println(new parent().num2);
		method2();
		parent.method2();
		new InheritanceReview();
	}
	
	
	public void methodA() {
		num2=300;
	}
	
}
