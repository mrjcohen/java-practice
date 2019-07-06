package day62_exceptions01;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedVSUnchecked {
	public static void main(String[] args) {
		
		//Thread.sleep(2000);    checked exception - InterruptedException
		// Two ways to deal with it
			//Handle or Declare
		
		
		//Handle
		try {
			System.out.println("sleeping");
			Thread.sleep(2000); 
		} catch (InterruptedException e) {
			System.out.println("Thread is interrupted!");
		}
		System.out.println("woke up");
		
		
		
		try {
			URL url = new URL("www.google.com");
			System.out.println(url.toString());
		} catch (MalformedURLException e) {
			System.out.println("Invalid URL");
		}
		
		
	}
}
