package day05_math_operators;

public class CompanyWarmUp {
	public static void main(String[] args) {
		
		String companyName;
		String address;
		int numberOfEmployees;
		long revenue;
		boolean isTechCompany;
		String aboutCompany;
		
		companyName = "Facebook";
		address = "Silicon Valley, CA";
		numberOfEmployees = 10234;
		revenue = 5000234123L;
		isTechCompany = true;
		aboutCompany = "The company " +companyName+ " is located in " +address+ ". It has " +numberOfEmployees+ " employees and a revenue of " +revenue+ ". It is " +isTechCompany+ " that " +companyName+ " is a tech company.";
		
		
		System.out.println("The company name is " +companyName);
		System.out.println("Address is " +address);
		System.out.println("Number of employees is " +numberOfEmployees);
		System.out.println("Company revenue is " +revenue);
//		System.out.println("The company is a tech company: " +isTechCompany);
				
		if (isTechCompany = true) {
			
			System.out.println("The company is a tech company");
			
		} else {
			
			System.out.println("The company is not a tech company");
			
		}
		
	
		
		
		
		System.out.println(" ");
		System.out.println(aboutCompany);
		
		
	}

}
