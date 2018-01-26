package day4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import day3.Customer;
import utils.Execute;

public class DayFour implements Execute{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("beans.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(r);
		
		Customer cus = (Customer) factory.getBean("customer3");
		cus.printCustomerAddress();
	}
	
	
}
