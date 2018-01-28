package day6;

public class Employee {
	private String name;
	private int age;
	private int cmnd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	@Override
	public String toString() {
		return "Employee [name: " + name + ", age:" + age + ", cmnd: " + cmnd + "]";
	}
	
}
