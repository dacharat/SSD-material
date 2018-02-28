package strategy;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", name, age);
	}
	
	public int compareTo(Person p) {
		return this.getAge() - p.getAge();
	}

}
