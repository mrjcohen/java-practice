package day50_inheritance03;

public class AndroidApp extends App{
	
	private String developer;
	
	public AndroidApp(String name) {
		super(name);
	}
	
	public AndroidApp() {
		super("AndroidApp - unknown");
	}
}
