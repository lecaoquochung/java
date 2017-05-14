package samples;

// TODO save data to database
public class Vehicle {
	public String color;
	public String brand;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
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
	
	// getter color
		public String getBrand() {
			return brand;
		}
		
		// setter color
		public void setBrand(String b) {
			this.brand = b;
		}
}
