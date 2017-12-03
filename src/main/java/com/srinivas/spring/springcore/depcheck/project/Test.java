package com.srinivas.spring.springcore.depcheck.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srinivas/spring/springcore/depcheck/project/universityConfig.xml"
				);
		
		University university = (University) context.getBean("university");
		System.out.println(university);
		System.out.println(university.hashCode());
		System.out.println("****************************************");
		University university2 = (University) context.getBean("university");
		System.out.println(university2);
		System.out.println(university2.hashCode());
	}
	
}
