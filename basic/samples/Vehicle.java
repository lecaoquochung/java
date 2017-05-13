package samples;

// TODO save data to database
public class Vehicle {
	private String color;
//	private int maxSpeed;
//	private int wheels;
//	private double fuelCapacity;
//	private String url;
	
	public static int COUNT=0;
	
	// constructor
	public Vehicle() {
		COUNT++;
		this.setColor("Red"); // initialize value
	}
	
	public void horn() {
		System.out.println("Beep Beep!");
	}
	
	// getter color
	public String getColor() {
		return color;
	}
	
	// setter color
	public void setColor(String c) {
		this.color = c;
	}
}
