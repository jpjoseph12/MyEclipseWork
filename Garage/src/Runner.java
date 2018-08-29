import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		

		for (Vehicle i : vehicles) {

			if (i instanceof Car) {
				System.out.println( ((Car) i).toString());
			} 	else if (i instanceof Motorbike)	{
				System.out.println(((Motorbike) i).toString());
			}
		}
		
	}
}
		

	
	

