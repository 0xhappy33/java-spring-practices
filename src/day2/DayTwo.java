package day2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import utils.Execute;

@SuppressWarnings("deprecation")
public class DayTwo implements Execute{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Customer cus = (Customer) factory.getBean("customer1");
		System.out.println(cus);
	}
	
}
