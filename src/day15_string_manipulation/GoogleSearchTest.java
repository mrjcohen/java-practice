package day15_string_manipulation;

public class GoogleSearchTest {
	public static void main(String[] args) {
		
		String item = "java";
		String pageTitle = item + " - Google Search";
		
		//startsWith and endsWith can be used with VARIABLES
		if (pageTitle.startsWith(item)) {
			System.out.println("Page title check passed");
		} else {
			System.out.println("FAIL: Page title check failed");
		}
	
		//startsWith and endsWith can be used with STRINGS
		if (pageTitle.endsWith("Google Search")) {
			System.out.println("Page title check passed");
		} else {
			System.out.println("FAIL: Page title check failed");
		}
		
		
		
	}
}
