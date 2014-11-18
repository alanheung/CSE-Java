package com.mydomain.shoppingcart.dao;

import com.mydomain.shoppingcart.bo.Basket;
import com.mydomain.shoppingcart.bo.BasketItem;

/** 
 * @author Ross
 */
public interface BasketDao {
	public void delete(final Basket basket) throws Exception;
	public void saveOrUpdateBasket(final Basket basket) throws Exception;
	public Basket removeItemFromBasket(BasketItem basketItem) throws Exception;
}
