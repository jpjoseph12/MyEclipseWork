
public class Car extends Vehicle {
	public String make;
	public String model;
	public int speed;
	public int gears;
	public int seats;
	
	public Car (String make, String model, int speed, int gears, int seats, double engineSize, int wheels) {
		this.make = make;
		this.model = model;
		this.speed = speed;
		this.gears = gears;
		this.seats = seats;	
		this.engineSize = engineSize;
		this.wheels = wheels;
	}
}
