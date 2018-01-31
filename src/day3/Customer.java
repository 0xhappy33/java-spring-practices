package day3;

import day4.Booking;

public class Customer {
	private String name;
	private int age;
	private int cmnd;
	private int gender;
	private Address address;
	
	private Booking booking;
	
	public Customer() {
		
	}
	public Customer(Booking booking) {
		this.booking = booking;
	}
	
	public Customer(Address address) {
		super();
		this.address = address;
	}

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Customer has name: " + name + ", age: " +
				age + ", cmnd: " + cmnd + ", gender: "
				+ gender;
	}
	
	public void printCustomerAddress() {
		System.out.println(this.address);
	}
	
	public void printCustomerBooking () {
		System.out.println(booking);
	}
}
