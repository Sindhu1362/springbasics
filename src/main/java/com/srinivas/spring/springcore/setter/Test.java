package com.srinivas.spring.springcore.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srinivas.spring.springcore.set.CarDealer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srinivas/spring/springcore/setter/shoppingCartConfig.xml"
				);
		ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingCart");
		
		System.out.println(shoppingCart);
	}

}
