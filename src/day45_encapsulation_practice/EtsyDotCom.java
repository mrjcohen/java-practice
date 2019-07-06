package day45_encapsulation_practice;

public class EtsyDotCom {
	public static void main (String[] args) {
		
		//Valid account - first consructor
		EtsyAccount acct1 = new EtsyAccount();
		System.out.println(acct1.toString());
		acct1.setEmail("pumev@mrmail.info");
		acct1.setFirstName("pumev");
		acct1.setPassword("bulgaria123");
		System.out.println(acct1.toString());
		
		//Invalid account - first constructor
		EtsyAccount acct2 = new EtsyAccount();
		acct2.setEmail("helirevaroyalhost.info");
		acct2.setFirstName("helireva123");
		acct2.setPassword("abc");
		System.out.println(acct2.toString());
		
		//Valid account - second consructor
		EtsyAccount acct3 = new EtsyAccount("helireva@royalhost.info" , "Helireva" , "royal1234");
		System.out.println(acct3.toString());
		
		//Valid account - third constructor with random password generator
		EtsyAccount acct4 = new EtsyAccount("woodenspoon@gmail.com" , "WdSpoon");
		System.out.println(acct4.toString());
		
		//final keyword makes it so password cant change - we will learn this later
		//final String password = "lkds32";
		
		
		
		
	}
}
