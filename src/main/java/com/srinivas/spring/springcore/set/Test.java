package com.srinivas.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srinivas/spring/springcore/set/setConfig.xml"
				);
		CarDealer carDealer = (CarDealer) context.getBean("carDealer");
		
		System.out.println("Car Dealer name: "+carDealer.getName());
		System.out.println("Models available:");
		System.out.println(carDealer.getModels());
		System.out.println("Type of set created by spring container: "+carDealer.getModels().getClass());
	}

}
