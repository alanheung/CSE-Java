package com.mydomain.shoppingcart.view;

import com.mydomain.shoppingcart.bo.Item;

/**
 * @author Ross
 */
public class Checkout {
	private ShoppingViewHelper shoppingViewHelper;
	private double total;

	public String cancelOrder() {
		getShoppingViewHelper().getBasket().empty();
		return "cancel";
	}

	public String processPayment() {
		return "pay";
	}

	public ShoppingViewHelper getShoppingViewHelper() {
		return shoppingViewHelper;
	}

	public double getTotal() {
		total = 0;
		for (Item item : getShoppingViewHelper().getBasket().getItems()) {
			total = total + item.getPrice();
		}
		return total;
	}
	
	public void setShoppingViewHelper(ShoppingViewHelper shoppingViewHelper) {
		this.shoppingViewHelper = shoppingViewHelper;
	}
}