package day31_methods03;

public class Authentication {
	public static void login (String username, String password) {
		
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";
		
		if (username.equals(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successful! Welcom to Okta");
		} else if (!username.equals(validUsername) && password.equals(validPassword)) {
			System.out.println("Invalid Username");
		} else if (username.equals(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid Password");
		} else {
			System.out.println("Sign in failed!");
		}
		
	}
	public static void main(String[] args) {
		
		login("mentoring@cybertekschool.com" , "mentor001");
		
	}
}
