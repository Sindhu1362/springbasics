package com.srinivas.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srinivas/spring/springcore/reftypes/studentConfig.xml"
				);
		
		Student student = (Student) context.getBean("student");
		
		System.out.println(student);

	}

}
