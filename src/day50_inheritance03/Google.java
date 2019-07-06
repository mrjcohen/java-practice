package day50_inheritance03;

public class Google extends SearchEngine {
	
	//public
	public int search(String item) {
		System.out.println("Google Searching for : " + item);
		int resultsCount = item.length();
		return resultsCount;
	}
	
	//public protected
	protected void search(String item, String item2) {
		System.out.println("Searching for : " + item);
		int resultsCount = item.length() + item2.length();
		System.out.println("Total count: " + resultsCount);
	}
	
	//public, protected, default
	String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}
	
}
