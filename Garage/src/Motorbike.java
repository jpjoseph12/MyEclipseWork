
public class Motorbike extends Vehicle {
	String type;
	String model;
	String make;
	public Motorbike(String type, String model, String make, float engineSize, int wheels) {
		super(engineSize, wheels);
		this.type = type;
		this.model = model;
		this.make = make;

	}
	public String toString() {
		return type + model + make +engineSize + wheels;
	}
}
