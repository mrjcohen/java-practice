package day46_static_keyword;

public class CompanyTest {
	public static void main(String[] args) {
		
		//Print cname variable
		System.out.println(Company.cname);					//Deloitte
		
		//Print cname variable in upper cases
		System.out.println(Company.cname.toUpperCase());	//DELOITTE
		
		Company.companyInfo();								//Company name is Deloitte
		
		Company c = new Company();							
		c.companyInfo();									//Company name is Deloitte
		Company.companyInfo();								//Company name is Deloitte
		
		System.out.println(Math.round(455.49));
		
		
	}
}




