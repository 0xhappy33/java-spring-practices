package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import utils.Execute;

public class DayOne implements Execute{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("hello");
		
		obj.setMessage("I'm Ha");
		obj.getMessage();
		
		HelloWorld objB = (HelloWorld) context.getBean("hello");
		objB.getMessage();
	}
}
