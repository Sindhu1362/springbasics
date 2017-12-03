package com.srinivas.spring.springcore.lc.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}

	public void hi() {
		System.out.println("Intialization method");
	}
	
	public void bye() {
		System.out.println("Destruction method");
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
}
