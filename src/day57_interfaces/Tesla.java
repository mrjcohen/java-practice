package day57_interfaces;

public class Tesla extends Vehicle implements Electric, Autonomous {
	
	@Override
	public void charge() {
		System.out.println("Tesla is charging at charging station");
	}
	
	@Override
	public void selfDrive() {
		System.out.println("Tesla is in autopilot mode. Driving autonomously");
	}

}
