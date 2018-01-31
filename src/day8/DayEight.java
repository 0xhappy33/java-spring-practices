package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import utils.IExecute;

public class DayEight implements IExecute{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		VipCustomer vipCus = (VipCustomer) context.getBean("vipCustomer");
		System.out.println(vipCus);
	}

}
