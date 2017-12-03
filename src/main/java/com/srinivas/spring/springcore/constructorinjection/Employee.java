package com.srinivas.spring.springcore.constructorinjection;

public class Employee {
	
	private int id;
	private Address address;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

	public Employee(int id, Address address) {
		this.id = id;
		this.address = address;
	}
	
	

}
