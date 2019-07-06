package day62_exceptions01;

public class RuntimeError {
	static int i = 0;
	public static void main(String[] args) {
		//below line will create StackOverFlowError. Stack gets full
		go();
	}
	
	public static void go() {
		System.out.println(i + "going");
		i++;
		go(); //method calling itself - recursive method (recursion)
	}
}
