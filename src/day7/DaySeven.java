package day7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import utils.Execute;

public class DaySeven implements Execute{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String bean = "beans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(bean);
		Resort resort = (Resort) context.getBean("furama");
		System.out.println(resort.getCustomerList());
		System.out.println(resort.getCustomerMap());
		System.out.println(resort.getCustomerSet());
		System.out.println(resort.getCustomerProp());
		
	}

}
