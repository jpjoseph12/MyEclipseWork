import java.util.ArrayList;

public class Person {
	ArrayList<Person>people = new ArrayList<Person>();
	private String name;
	private String occupation;
	private int age;
	
	public Person(String name, String occupation, int age) {
		this.name = name;
		this.occupation = occupation;
		this.age = age;
	}
}
