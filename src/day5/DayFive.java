package day5;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import utils.IExecute;

public class DayFive implements IExecute{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String bean = "beans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(bean);
	
		Payment payMent = (Payment) context.getBean("payMent");
		payMent.printCustomerPayment();
	}
	

}
