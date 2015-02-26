package com.mase.oop1;

import java.util.Date;

class Purchase implements ElectronicDevice{
	protected double price;
	protected String shop;
	protected Date dateOfPurchase;
	protected ElectronicDevice device;

	public Purchase(String shop, Double price, Date dateOfPurchase, ElectronicDevice device){
		this.price=price;
		this.shop=shop;
		this.dateOfPurchase= new Date(dateOfPurchase.getTime());
		this.device= device;//(device.getTheMake());
	}
	public static Purchase createNewInstance(String shop, Double price, Date dateOfPurchase, ElectronicDevice device){
		return new Purchase(shop, price, dateOfPurchase, device);
	}

	public double getPrice() {
		return price;
	}
	public String getShop() {
		return shop;
	}
	public Date getDateOfPurchase() {
		return new Date(dateOfPurchase.getTime());
	}
	public ElectronicDevice getDevice() {
		return device;
	}
	@Override
	public String toString() {
		return "Purchase [price=" + price + ", shop=" + shop
				+ ", dateOfPurchase=" + dateOfPurchase + ", device=" + device
				+ "]";
	}
	@Override
	public void turnOn() {
		System.out.println(ElectronicDevice.class+"turnOn");		
		System.out.println("Purchase:turnOn");		
	}
	@Override
	public void turnOff() {
		System.out.println(ElectronicDevice.class+"turnOff");		
		System.out.println("Purchase:turnOff");		

	}
	@Override
	public String getTheMake() {
		return null;
	}
	@Override
	public String getTheModel() {
		return null;
	}

}
