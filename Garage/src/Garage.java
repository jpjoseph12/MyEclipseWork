import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public void insert () {
		
	}
	Car car1 = new Car("Suzuki", "Swift", 97, 5, 4, 1.2f, 4);
	Car car2 = new Car("Vauxhall","Meriva", 83, 5, 7 , 1.1f, 4);
	Motorbike Mb1 = new Motorbike("Sports", "Kawasaki","Ninja", 1.3f, 2 );
	vehicles.add(car1);
	vehicles.add(car2);
	vehicles.add(Mb1);
	

	
}
