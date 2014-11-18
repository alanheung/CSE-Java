package com.mydomain.shoppingcart.dao;

import java.util.List;

import com.mydomain.shoppingcart.bo.Item;

/** 
 * @author Ross
 */
public interface ItemDao {
	public void addItem(Item item) throws Exception;
	public List<Item> list() throws Exception;
	public Item load(final Long id) throws Exception;
}
