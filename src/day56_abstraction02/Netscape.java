package day56_abstraction02;

public class Netscape extends Browser {

	@Override
	public void navigate(String url) {
		System.out.println("Netscape - navigating to " + url);
	}
	
	@Override
	public void displayWebPage() {
		System.out.println("Netscape - display webpage");
	}
	
	@Override
	public boolean launch() {
		System.out.println("Netscape is launching");
		System.out.println("1 2 3");
		return true;
	}
	
	@Override
	public void close() {
		//super.close();
		System.out.println("Exitting netscape");
	}
	
}
