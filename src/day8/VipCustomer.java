package day8;

public class VipCustomer {
	
	private String name;
	private float money;
	private boolean isVip;
	private String address;
	private boolean isDiscount;
	private boolean isValidPhoneNumber;

	@Override
	public String toString() {
		return "VipCustomer [name=" + name + ", isVip=" + isVip + ", address=" + address + ", money=" + money
				+ ", isDiscount=" + isDiscount + ", isValidPhoneNumber=" + isValidPhoneNumber + "]";
	}
	
	
	
}
