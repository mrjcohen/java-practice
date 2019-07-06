package day54_inheritanceReview;

class superclass{
	
	public void original() {
		System.out.println("cybertek");
	}
	
}


public class Method_Overriding extends superclass{

	@Override
	public void original() {
		System.out.println("Batch 11");
	}
	
	
	public static void main(String[] args) {
		new superclass().original();
		new Method_Overriding().original();
	}
}

