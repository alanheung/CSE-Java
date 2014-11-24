package com.mydomain.shoppingcart.bo;

/** 
 * @author Ross
 */
public class Item {
	private String description;
	private long id;
	private String name;
	private double price;

	public Item() {}

	public Item(long id, String name, String description, double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setDescription(String theDescription) {
		description = theDescription;
	}

	public void setId(long theId) {
		id = theId;
	}
	
	public void setName(String theName) {
		name = theName;
	}
	
	public void setPrice(double thePrice) {
		price = thePrice;
	}
}

