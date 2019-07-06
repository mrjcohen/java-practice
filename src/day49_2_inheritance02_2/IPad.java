package day49_2_inheritance02_2;

//IPad is a Sub Class of Device in a different package
//must import so the subclass is available
import day49_inheritance02.Device;

public class IPad extends Device{
	
	public void readEBook(String title) {
		System.out.println("Reading a book " + title + " using " + brand + " tablet");
		System.out.println(model);
		
		//Default is not visible here
		//System.out.println(price);
		
		//Private not visible here
		//System.out.println("made in " + country);
	}

}
