package day6;

public class SwimmingPool {
	private String name;
	private int openHour;
	
	private Employee employee;
	
//	public SwimmingPool(Employee employee) {
//		super();
//		this.employee = employee;
//	}
	
	
	public String getName() {
		return name;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOpenHour() {
		return openHour;
	}
	public void setOpenHour(int openHour) {
		this.openHour = openHour;
	}
	
	public void printSwimmingPool() {
		System.out.println(getName() +" - open at: "+ getOpenHour() +"h" + "\n"
					+ employee );
	}
	
}
