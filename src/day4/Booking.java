package day4;

import java.util.Date;

public class Booking {
	private int id;
	private int numberBooking;
	private int money;
	private Date date;
	
	public Booking(int id) {
		this.id = id;
	}
	
	public Booking(int id, int numberBooking, int money, Date date) {
		super();
		this.id = id;
		this.numberBooking = numberBooking;
		this.money = money;
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", numberBooking=" + numberBooking + ", money=" + money + ", date=" + date + "]";
	}
	
	
	
}
