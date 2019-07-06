package day46_static_keyword;

public class Campus {
	private String city;
	static String country;
	
	static {
		System.out.println("static block - 1");
		country = "USA";
	} 
	
	static {
		System.out.println("static block - 2");
		country = "Canada";
	} 
	
	public Campus(String city)  {
		System.out.println("Constructor");
		this.city = city;
	}
	
	public static void campusInfo() {
		System.out.println("Wecome to campus");
	}

	public String getCity() {
		System.out.println("Getter");
		return city;
	}

	public void setCity(String city) {
		System.out.println("Setter");
		this.city = city;
	}
	
}
