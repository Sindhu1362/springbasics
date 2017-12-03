package com.srinivas.spring.springcore.depcheck.project;

import org.springframework.beans.factory.annotation.Required;

public class University {

	private int id;
	private String name;
	private String location;
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
}
