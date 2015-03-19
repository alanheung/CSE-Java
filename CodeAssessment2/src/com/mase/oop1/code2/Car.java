package com.mase.oop1.code2;

public class Car {
	private String reg;
	private String make;
	private String model;
	private String tag;
	private double price;

	public Car(String reg, String make, String model, String tag, double price) {
		super();
		this.reg = reg;
		this.make = make;
		this.model = model;
		this.tag = tag;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [reg=" + reg + ", make=" + make + ", model=" + model
				+ ", tag=" + tag + ", price=" + price + "]";
	}

}
