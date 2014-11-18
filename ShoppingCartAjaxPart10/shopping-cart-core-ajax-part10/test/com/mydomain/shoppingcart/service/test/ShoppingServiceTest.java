package com.mydomain.shoppingcart.service.test;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mydomain.shoppingcart.bo.Basket;
import com.mydomain.shoppingcart.bo.Item;
import com.mydomain.shoppingcart.dao.BasketDao;
import com.mydomain.shoppingcart.service.ShoppingService;

/** 
 * @author Ross
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/shoppingcart-test.xml" })
public class ShoppingServiceTest {
	private Basket basket;
	private BasketDao basketDaoMock;
	@Autowired
	private ShoppingService shoppingManager;
	private ShoppingService shoppingManagerMock;
	private Item testItem;

	/**
	 * Tests adding an item to the basket.
	 */
	@Test
	@DirtiesContext
	public void addItem() {
		int itemCount = basket.getItemCount();
		basket.addItem(testItem);
		assertEquals(itemCount + 1, basket.getItemCount());
	}

	/**
	 * Tests emptying the basket.
	 */
	@Test
	@DirtiesContext
	public void empty() {
		basket.empty();
		assertEquals(0, basket.getItemCount());
	}

	/**
	 * Tests finding items.
	 */
	@Test
	public void findItems() {
		try {
			int itemCount = basket.getItemCount();
			List<Item> mockResult = new LinkedList<Item>();
			for (int i = 0; i < itemCount; i++) {
				mockResult.add(new Item());
			}
			expect(shoppingManagerMock.findItems()).andReturn(mockResult);
			replay(shoppingManagerMock);
			
			List<Item> allItems = new LinkedList<Item>(shoppingManagerMock.findItems());
			assertEquals(itemCount, allItems.size());
			
			verify(shoppingManagerMock);
		} catch (Exception e) {
			fail("Error in Shopping Manager");
		}
	}

//	/**
//	 * Tests saving a basket.
//	 */
//	@Test
//	public void saveBasket() {
//		try {
//			shoppingManager.setBasketDao(basketDaoMock);
//			basketDaoMock.saveOrUpdateBasket(basket);
//			replay(basketDaoMock);
//			shoppingManager.updateBasket(basket);
//			verify(basketDaoMock);
//		} catch (Exception e) {
//			fail("Error in Shopping Manager");
//		}
//	}
	
	/**
	 * Sets up the test fixture.
	 * 
	 * Called before every test case method.
	 */
	@Before
	public void setUp() {
		try {
			shoppingManagerMock = createMock(ShoppingService.class);
			basketDaoMock = createMock(BasketDao.class);
			testItem = new Item(1l, "Candy Cotton", "Candy coated milky tarts", 8.50d);
			basket = new Basket();
			basket.addItem(new Item(2l, "Jelly Beans", "Jelly icecream waffle cream", 18.99d));
			basket.addItem(new Item(3l, "Jam Doughnut", "Strawberry jam and Christmas pudding", 23.00d));
        } catch (Exception e) {
			fail("Error setting up test case");
		}
	}
}
