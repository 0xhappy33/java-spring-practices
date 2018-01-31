package day9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import utils.IExecute;

public class DayNine implements IExecute{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer cus = (Customer) context.getBean("customer9");
	}

}
