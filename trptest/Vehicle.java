package trptest;

public class Vehicle {
	
	private String make;
	private String model;
	private String color;
	private short year;
	private int price;
	private float tccRating;
	private byte hwyMpg;
	
	public Vehicle(String make, String model, String color, short year, int price, float tccRating, byte hwyMpg) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
		this.tccRating = tccRating;
		this.hwyMpg = hwyMpg;
	}
	
	public String toString() {
		return make + " " + model +" "+color+" "+year+" "+price+" "+tccRating+" "+hwyMpg;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getTccRating() {
		return tccRating;
	}
	public void setTccRating(float tccRating) {
		this.tccRating = tccRating;
	}
	public byte getHwyMpg() {
		return hwyMpg;
	}
	public void setHwyMpg(byte hwyMpg) {
		this.hwyMpg = hwyMpg;
	}
}
