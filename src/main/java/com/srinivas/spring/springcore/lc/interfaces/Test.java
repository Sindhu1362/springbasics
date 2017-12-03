package com.srinivas.spring.springcore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srinivas/spring/springcore/lc/interfaces/patientConfig.xml"
				);
		Patient patient = (Patient) context.getBean("patient");
		
		System.out.println(patient);
		//setup the shut down hook for the execution of destroy method
		context.registerShutdownHook();
		context.close();
	}

}
