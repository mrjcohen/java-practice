package day54_inheritanceReview;

class chain {
	public chain() {
		
		System.out.println("A");
	}

	public chain(int a) {
		this();
		System.out.println("B");
	}

	public chain(double b) {
		this(9);
		System.out.println("C");
	}
}

public class this_super {
	public static void main(String[] args) {
		
		chain c = new chain(9);
		
		
	}
}
