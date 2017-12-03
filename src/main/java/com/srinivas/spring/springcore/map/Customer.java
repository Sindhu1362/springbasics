package com.srinivas.spring.springcore.map;

import java.util.*;

public class Customer {

	private int id;
	private String name;
	private Map<Integer, String> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, String> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("Customer id: " + this.id + "\n");
		sb.append("Customer name: " + this.name + "\n");
		sb.append("Products comprising:" + "\n");
		sb.append(this.products);

		return sb.toString();
	}

}
