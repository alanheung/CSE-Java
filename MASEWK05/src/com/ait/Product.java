package com.ait;

import java.text.NumberFormat;

public class Product {
	private String code;
	private String description;
	private double price;
	protected static int count = 0;
	
	public Product() {
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}

	public String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description
				+ ", price=" + this.getFormattedPrice() + "]";
	}
	public static int getCount(){
		return count;
	}
	
}
