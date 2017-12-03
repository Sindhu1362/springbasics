package com.srinivas.spring.springcore.innerbeans;

public class Address {

	private int hno;
	private String street;
	public int getHno() {
		return hno;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	private String city;
	
	public void setHno(int hno) {
		this.hno = hno;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + "]";
	}
}
