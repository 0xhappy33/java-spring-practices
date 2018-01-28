package day6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day5.Payment;
import utils.Execute;

public class DaySix implements Execute{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String bean = "beans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(bean);
	
		SwimmingPool sw = (SwimmingPool) context.getBean("swimmingPool");
		sw.printSwimmingPool();
	}
	

}
