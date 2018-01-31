package day9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean, DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public void init() {
		System.out.println("Customer is being created!");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.print("Customer is destroy!!!");
	}
	

}
