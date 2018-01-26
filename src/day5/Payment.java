package day5;

public class Payment {
	private Order order;

	public Payment(Order order) {
		super();
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public float caculateBill() {
		long diff = Math.abs(getOrder().getCheckOutDate().getTime() - getOrder().getCheckInDate().getTime());
		long diffDays = diff / (24 * 60 * 60 * 1000);
		return diffDays*order.getPrice();
	}
	
	public void printCustomerPayment() {
		float amount = caculateBill();
		System.out.println("Check in: " + getOrder().getCheckInDate() + "\n"
							 + "Check out: " + getOrder().getCheckOutDate() + "\n"
							 + "Amount to be paid : " + getOrder().getDayOfInvoice() + "");
	}
}
