package com.srinivas.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srinivas/spring/springcore/properties/propertiesConfig.xml"
				);
		
		Languages languages = (Languages) context.getBean("countriesAndLangs");
		
		System.out.println(languages);
		
	}

}
