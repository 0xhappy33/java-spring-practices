package day3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import utils.IExecute;

public class DayThree implements IExecute{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("beans.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(r);
		
		Customer cus = (Customer) factory.getBean("customer2");
		cus.printCustomerAddress();
	}
	
	
}
