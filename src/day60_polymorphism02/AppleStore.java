package day60_polymorphism02;

public class AppleStore {
	public static void main(String[] args) {
		
		AppleDevice mac = new Mac();
		mac.use();
		//mac.code(); - code() is not visible 
		
		Mac myMac = new Mac();
		myMac.use();
		myMac.code();
		
		AppleDevice watch = new AppleWatch();
		watch.use();
		//watch.wear(); - wear() not visible
		
		AppleDevice ipad = new IPad();
		ipad.use();
		//ipad.draw(); - draw() not visible
		
		
		
		
		AppleDevice dev1 = new Mac();
		System.out.println(dev1.startingPrice);
		//System.out.println(dev1.model); = model variable not visible
		
		Mac mac1 = new Mac();
		System.out.println(mac1.startingPrice);
		System.out.println(mac1.model);
		
		
		
		AppleDevice dev2 = new IPad();
		System.out.println(dev2.startingPrice);
		//System.out.println(dev2.screenSize); = screenSize variable not visible
		
		IPad ipad1 = new IPad();
		System.out.println(ipad1.startingPrice);
		System.out.println(ipad1.screenSize);
		
		
		
		AppleDevice dev3 = new AppleWatch();
		System.out.println(dev3.startingPrice);
		//System.out.println(dev3.weight); = weight variable not visible
		
		AppleWatch applewatch1 = new AppleWatch();
		System.out.println(applewatch1.startingPrice);
		System.out.println(applewatch1.weight);
		
		
		
		
	}
}
