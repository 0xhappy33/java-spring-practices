package day5;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import utils.Execute;

public class DayFive implements Execute{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String bean = "beans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(bean);
	
		Payment payMent = (Payment) context.getBean("payMent");
		payMent.printCustomerPayment();
	}
	

}
