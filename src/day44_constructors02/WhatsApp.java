package day44_constructors02;

public class WhatsApp {
	
	private String toNumber;
	private String message;
	private boolean delivered;
	
	public WhatsApp() {
		System.out.println("No-args constuctor");
	}
	
	public WhatsApp(String toNumber, String message) {
		this();
		System.out.println("two-args constuctor");
		this.message = message;
		this.toNumber = toNumber;
	}
	
	public WhatsApp(String toNumber) {
		//toNumber, "[]"  =========> Use this() to pass the toNumber but change the message to "[]"
		//this.message = "[]";
		//this.toNumber = toNumber;
		this(toNumber , "[]");
		System.out.println("one-arg constructor");
	}
	
	@Override
	public String toString() {
		return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
	}
	
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	
}
