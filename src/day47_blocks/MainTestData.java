package day47_blocks;

public class MainTestData {
	public static void main(String[] args) {
		
		//In order to print the static variable from another class
		//in the static main method you use the class.variable
		System.out.println(TestData.url);
		String briteErpUrl = TestData.url;
		System.out.println(briteErpUrl);
		
		//You can access the static variable though the class (Static way)
		System.out.println(TestData.email);
		
		//You can access the static variable through an object
		TestData td = new TestData();
		System.out.println(td.email);
		
		
	}
}
