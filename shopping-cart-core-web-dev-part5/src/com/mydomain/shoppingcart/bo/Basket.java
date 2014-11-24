package com.mydomain.shoppingcart.bo;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author Ross
 */
public class Basket {
	private long id;
	private List<Item> items;

	public void addItem(Item item) {
		getItems().add(item);
	}

	public void empty() {
		setItems(new ArrayList<Item>());
	}

	public double getBalance() {
		double balance = 0;
		for (Item item : getItems()) {
			balance = balance + item.getPrice();
		}
		return balance;
	}

	public long getId() {
		return id;
	}
	
	public int getItemCount() {
		return getItems().size();
	}
	
	public List<Item> getItems() {
		if (items == null) {
			items = new ArrayList<Item>();
		}
		return items;
	}
	
	public void removeItem(Item item) {
		getItems().remove(item);
	}
	
	public void setId(long theId) {
		id = theId;
	}
	
	public void setItems(List<Item> theItems) {
		items = theItems;
	}
}