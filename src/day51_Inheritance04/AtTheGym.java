package day51_Inheritance04;

public class AtTheGym extends Exercise {
	public static void main (String[] args) {
		
		Exercise e = new Exercise();
		Running r = new Running();
		Swimming s = new Swimming();
		Yoga y = new Yoga();
		JuiJitsu j = new JuiJitsu();
		Sprinting sp = new Sprinting();
		
		System.out.println(e.perform(30));
		System.out.println(r.perform(40));
		System.out.println(s.perform(45));
		System.out.println(y.perform(60));
		System.out.println(j.perform(60));
		System.out.println(sp.perform(25));
		
		
		Snowboarding sn = new Snowboarding();
		System.out.println(sn.perform(100));
		
		
	}
}
