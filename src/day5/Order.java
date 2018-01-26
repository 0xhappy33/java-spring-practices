package day5;

import java.util.Date;

public class Order {
	private float price;
	private Date checkInDate;
	private Date checkOutDate;
	private Date dayOfInvoice;

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getDayOfInvoice() {
		return dayOfInvoice;
	}

	public void setDayOfInvoice(Date dayOfInvoice) {
		this.dayOfInvoice = dayOfInvoice;
	}
	
	
}
