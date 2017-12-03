package com.srinivas.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srinivas.spring.springcore.constructorinjection.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srinivas/spring/springcore/propertyplaceholder/placeholderConfig.xml"
				);
		MyDAO myDAO = (MyDAO)context.getBean("myDAO");
		System.out.println(myDAO);
	}

}
