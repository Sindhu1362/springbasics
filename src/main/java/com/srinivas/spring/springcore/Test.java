package com.srinivas.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"config.xml"
				);
		Employee empl = (Employee) ctx.getBean("emp");
		
		System.out.println("Employee ID: "+empl.getId());
		System.out.println("Employee Name: "+empl.getName());

	}

}
