package com.srinivas.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/srinivas/spring/springcore/list/listConfig.xml");
		Hospital hospital = (Hospital) cxt.getBean("hospital");
		System.out.println("Hospital name: "+hospital.getName());
		System.out.println("List of departments:");
		System.out.println(hospital.getDepartments());
	}

}
