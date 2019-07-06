package day43_encapsulation_constructor;

public class Tesla {
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;
	
	public boolean isValidModel(String model) {
		model = model.toLowerCase();
//METHOD1
//		if(model.equals("model s") || model.equals("model 3") || 
//				model.equals("model x") || model.equals("model y") || 
//				model.equals("roadster")) {
//			return true;
//		} 
//		return false;
//METHOD2		
//		return 	model.equals("model s") || 
//				model.equals("model 3") || 
//				model.equals("model x") || 
//				model.equals("model y") || 
//				model.equals("roadster");
//METHOD3
		switch (model) {
		case "model s":
		case "model 3":
		case "model x":
		case "model y":
		case "roadster":
			return true;
		default:
			return false;
		}
	}

	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}

	public void setTeslaInfo(String model, int range, double zeroTo60, double price, boolean selfDriving) {
		setModel(model);
		setRange(range);
		setZeroTo60(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
	}
	
	public void setModel(String model) {
		if(isValidModel(model)) {
			this.model = model;
		} else {
			System.out.println("Invalid model - " + model);
			this.model = "unknown";
		}	
	}
	
	public String getModel() {
		return model;
	}
	
	public void setRange(int range) {
		this.range = range;
	}
	
	public int getRange() {
		return range;
	}
	
	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}
	
	public double getZeroTo60() {
		return zeroTo60;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getprice() {
		return price;
	}
	
	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}
	
	public boolean isSelfDriving() {
		return selfDriving;
	}
	

}
