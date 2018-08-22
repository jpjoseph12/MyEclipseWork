import java.util.ArrayList;


public class runner {

	public static void main(String[] args) {
		Person person1 = new Person("John", 22, "Soldier");
		Person person2 = new Person("Peter", 87, "Trafficker");
		
		
		ArrayList<Person>People = new ArrayList<Person>();
		People.add(person1);
		People.add(person2);
		System.out.println(People.toString());
	}
	

}
