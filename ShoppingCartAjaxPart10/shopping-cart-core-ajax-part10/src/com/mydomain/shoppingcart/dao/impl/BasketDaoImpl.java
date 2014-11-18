package com.mydomain.shoppingcart.dao.impl;

import java.sql.SQLException;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.mydomain.shoppingcart.bo.Basket;
import com.mydomain.shoppingcart.bo.BasketItem;
import com.mydomain.shoppingcart.dao.BasketDao;

/** 
 * @author Ross
 */
@Transactional
public class BasketDaoImpl extends HibernateDaoSupport implements BasketDao {

	public void delete(final Basket basket) throws Exception {
		HibernateCallback callback = new HibernateCallback() {
            public Object doInHibernate(Session session) 
                throws HibernateException,SQLException {
                Object basketObj = session.load(Basket.class, basket.getId());
            	session.delete(basketObj);
                return null;
            }
        };
        getHibernateTemplate().execute(callback);
	}

	public void saveOrUpdateBasket(final Basket basket) throws Exception {
        HibernateCallback callback = new HibernateCallback() {
            public Object doInHibernate(Session session) 
                throws HibernateException,SQLException {
                session.saveOrUpdate(basket);
                return null;
            }
        };
        getHibernateTemplate().execute(callback);
	}
	
	public Basket removeItemFromBasket(final BasketItem basketItem) throws Exception {
        HibernateCallback callback = new HibernateCallback() {
            public Object doInHibernate(Session session) 
                throws HibernateException,SQLException {
               
                Basket basket = (Basket) session.load(Basket.class, basketItem.getBasket().getId());
    			for (Iterator<BasketItem> it = basket.getBasketItems().iterator(); it.hasNext(); ) {
    				BasketItem existingBasketItem = (BasketItem) it.next();
    				if (existingBasketItem.getId().equals(basketItem.getId())) {
    					if (existingBasketItem.getQuantity() > 1) {
    						existingBasketItem.decreaseQuantity();
    					} else {
    						it.remove();
    					}
    				}
    			}
    			session.saveOrUpdate(basket);
                return basket;
            }
        };
        return (Basket)getHibernateTemplate().execute(callback);
	}
}
