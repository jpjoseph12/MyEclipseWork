
public class Person {
	public String name;
	public int age;
	public String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	public String toString() {
		return "My name is" + name + "and my age is " + age + "and I work as a " + jobTitle;
	}
	
}
