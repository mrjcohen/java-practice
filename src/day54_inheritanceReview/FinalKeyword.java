package day54_inheritanceReview;

class data1 {
	private String password = "123456";
	private final int age = 40;
	
	public String getPassword() {
		return password;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
//	public void setAge(int age) {          cant create a setter for a final instance variable
//		this.age = age;
//	}
	
}


public class FinalKeyword {
	
	final String name; 
	
	{
	//	name = "Batch 11";
	}
	
	public FinalKeyword() {
		name = "Batch 13";
	}
	
	final static String school;
	
	static {
		school = "Cybertek";
	}
	
	public static void main(String[] args) {
		
		final boolean result = false;
		
	}
}
