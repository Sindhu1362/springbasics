package com.srinivas.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srinivas/spring/springcore/constructorinjection/employeeConfig.xml"
				);
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
	}

}
