package day63_exceptions02;

import java.io.IOException;

public class ThrowAndThrows {
	
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000);
	}
	
	public static void main(String[] args) {
		
		System.out.println("hello world");
		//throw new RuntimeException("this is thrown using throw keyword");
		String username = "";
		
		if (username.isEmpty()) {
			throw new RuntimeException("Username cant be empty");
		} else {
			System.out.println("valid username");
		}
		
		//throwing checked exceotion
		//handle - declare. otherwise it will not compile
		try {
		throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			sleep(2);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
}
