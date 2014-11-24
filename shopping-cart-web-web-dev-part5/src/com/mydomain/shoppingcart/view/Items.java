package com.mydomain.shoppingcart.view;

import java.util.List;

import javax.faces.component.html.HtmlDataTable;

import com.mydomain.shoppingcart.bo.Item;

/**
 * @author Ross
 */
public class Items {
	private ShoppingViewHelper shoppingViewHelper;
	private HtmlDataTable basketTable;
	private List<Item> items;
	private HtmlDataTable itemsTable;

	public String addItemToBasket() {
		Item item = (Item) getItemsTable().getRowData();
		getShoppingViewHelper().addItemToBasket(item);
		return "";
	}

	public String checkout() {
		return "checkout";
	}

	public String removeItemFromBasket() {
		Item item = (Item) getBasketTable().getRowData();
		getShoppingViewHelper().removeItemFromBasket(item);
		return "";
	}

	private List<Item> findItems() {
		return getShoppingViewHelper().findItems();
	}

	public HtmlDataTable getBasketTable() {
		return basketTable;
	}

	public List<Item> getItems() {
		if (items == null) {
			items = findItems();
		}
		return items;
	}

	public HtmlDataTable getItemsTable() {
		return itemsTable;
	}

	public ShoppingViewHelper getShoppingViewHelper() {
		return shoppingViewHelper;
	}

	public void setBasketTable(HtmlDataTable basketTable) {
		this.basketTable = basketTable;
	}

	public void setItemsTable(HtmlDataTable itemsTable) {
		this.itemsTable = itemsTable;
	}
	
	public void setShoppingViewHelper(ShoppingViewHelper shoppingViewHelper) {
		this.shoppingViewHelper = shoppingViewHelper;
	}
}