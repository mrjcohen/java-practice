package day46_static_keyword;

public class Ebay {
	public static void main(String[] args) {
		Customer cm1 = new Customer("Abdallah Aleies" , "AbdallahAleies@gmail.com");
		Customer cm2 = new Customer("ADILET KYRGYZ" , "adilet@yahoo.com");
		Customer cm3 = new Customer("Anastasiia Zasibna" , "Anastisiia@outlook.com");
		
		System.out.println(cm3.count); 		//3
		System.out.println(Customer.count); //3
		
		Customer cm4 = new Customer("Bural Ucal" , "buralucal@gmail.com");
		
		System.out.println(cm3.count); 		//4
		System.out.println(Customer.count); //4
		
		//Changing the static count variable will change it when called byitself or any other object
		cm1.count = 10;
		System.out.println(cm1.count);		//10
		System.out.println(cm3.count);		//10
		System.out.println(Customer.count);	//10
	}
}
