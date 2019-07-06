package day57_interfaces;

public interface Electric {
	
	public static final boolean HAS_BATTERIES = true;
	int MAX_BATTERIES = 100_000; //since all variable in interface classes are 'public static final' 
								 //it will still be 'public static final' even if I dont write it
	
	public abstract void charge(); //automatically public abstract even if I don't write it
	
	
}
