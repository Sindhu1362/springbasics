package com.srinivas.spring.springcore.innerbeans;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private int empId;
	private Address address;
	
	@Required
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", address=" + address + "]";
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public Address getAddress() {
		return address;
	}
	
}
