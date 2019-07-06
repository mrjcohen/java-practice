package day45_encapsulation_practice;

import java.util.Random;

public class EtsyAccount {
	
	private String email;
	private String firstName;
	private String password;
	
	//constructor 1 [no args]
	public EtsyAccount() {
		this.email = "";		//email = ""; 		//setEmail("");
		this.firstName = "";	//firstName = ""; 	//setFirstName("");
		this.password = "";		//password = ""; 	//setPassword("");
	}
	
	//constructor 2 [three args]
	public EtsyAccount(String email, String firstName, String password) {
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
	}
	
	//constructor 3 [two args] - Autogenerates password and assigns
	public EtsyAccount(String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password = getRandomPassword();   //6 random characters
		//setPassword(getRandomPassword());
		
	}
	
	//random password generator - set to private so it can only be used in this class
	private String getRandomPassword() {
		Random rd = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
		String rdPassword = "";
		for (int i = 0 ; i <= 6 ; i++) {
			rdPassword += letters.charAt(rd.nextInt(letters.length()));
		}
		return rdPassword;
	}
	
	@Override
	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		//if email contains @ somewhere in the middle. assign it, if not "Please enter a vaild email address"
		if (email.indexOf("@") > 0 && email.indexOf('@') < email.length() -1) {
			this.email = email;
		} else {
			System.out.println("Please enter a vaild email address");
			this.email = "";
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (isValidFirstName(firstName)) {
			this.firstName = firstName;
		} else {
			System.out.println("Invalid first name");
			this.firstName = "";
		}
		
	}
	
	//method set to private so it can only be used in this class
	private boolean isValidFirstName(String firstName) {
		//first name cant be blank
		if(firstName.isEmpty()) {
			return false;
		}
		//first name cant start or end ith empty space
		if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}
		//first name must be alphabetic and cant contain spaces
		for (int i = 0 ; i < firstName.length() ; i++) {
			if (!Character.isAlphabetic(firstName.charAt(i)) && firstName.charAt(i) != ' ') {
				return false;
			}
		}
		return true;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		//password must be at least 6 characters
		if (password.length() < 6) {
			System.out.println("Password must be at least 6 characters");
			this.password = "";
		} else {
			this.password = password;
		}
		
	}
	
}
