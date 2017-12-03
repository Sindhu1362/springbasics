package com.srinivas.spring.springcore.setter;

public class ShoppingCart {

	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public String toString()
	{
		return "Shopping Cart comprises of: "+ "\n" +this.item;
	}
	
}
