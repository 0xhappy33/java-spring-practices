package day2;

public class Customer {
	private String name;
	private int age;
	private int cmnd;
	private int gender;
	
	
	public Customer() {
		super();
	}

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer has name: " + name + ", age: " +
				age + ", cmnd: " + cmnd + ", gender: "
				+ gender;
	}
	
}
