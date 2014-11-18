package com.mydomain.shoppingcart.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.mydomain.shoppingcart.bo.Item;

import com.mydomain.shoppingcart.dao.ItemDao;

/** 
 * @author Ross
 */
@Transactional
public class ItemDaoImpl extends HibernateDaoSupport implements ItemDao {

	public void addItem(final Item item) throws Exception {
		HibernateCallback callback = new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				session.saveOrUpdate(item);
				return null;
			}
		};
		getHibernateTemplate().execute(callback);
	}

	@SuppressWarnings("unchecked")
	public List<Item> list() throws Exception {
		HibernateCallback callback = new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Criteria criteria = session.createCriteria(Item.class);
				return criteria.list();
			}
		};
		return getHibernateTemplate().executeFind(callback);
	}

	public Item load(final Long id) throws Exception {
		HibernateCallback callback = new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				return session.load(Item.class, id);
			}
		};
		return (Item) getHibernateTemplate().execute(callback);
	}
}
