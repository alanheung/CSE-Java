package com.mydomain.shoppingcart.view;

import java.util.ArrayList;
import java.util.List;

import com.mydomain.shoppingcart.bo.Basket;
import com.mydomain.shoppingcart.bo.Item;

import com.mydomain.shoppingcart.service.ShoppingService;
import com.mydomain.shoppingcart.service.impl.ShoppingManager;

public class ShoppingViewHelper {
	private Basket basket;
	private ShoppingService shoppingManager;

	public void addItemToBasket(Item item) {
		getBasket().addItem(item);
	}

	public List<Item> findItems() {
		return new ArrayList<Item>(getShoppingManager().findItems());
	}

	public Basket getBasket() {
		if (basket == null) {
			basket = new Basket();
		}
		return basket;
	}

	public ShoppingService getShoppingManager() {
		if (shoppingManager == null) {
			shoppingManager = new ShoppingManager();
		}
		return shoppingManager;
	}
	
	public void removeItemFromBasket(Item item) {
		getBasket().removeItem(item);
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	public void setShoppingManager(ShoppingService shoppingManager) {
		this.shoppingManager = shoppingManager;
	}
}