

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProductTest {

	private Product product;
	
	@Before
	public void setUp(){
		product = new Product("Milk",1.50,"Dairy",1,15, "images/milk.jpg", false);
	}

	@Test
	public void testConstructorANDGetters() {
		assertEquals("Milk",product.getName());
		assertEquals(1.50,product.getPrice(),0.001);
		assertEquals("Dairy",product.getCategory());
		assertEquals(1,product.getCount());
		assertEquals(15,product.getTotalLeft());
		assertEquals(true,product.isSearch());
		assertFalse(product.isOnSpecialOffer());
	}
	@Test
	public void testSetters() {
		product = new Product("Milk",1.50,"Dairy",1,15, "images/milk.jpg", false);
		product.setName("Beef");
		product.setPrice(10);
		product.setCategory("Meat");
		product.setCount(2);
		product.setTotalLeft(9);
		product.setInBasket(1);
		product.setCanEdit(false);
		product.setSearch(false);
		product.setOnSpecialOffer(true);
		assertEquals(1,product.getInBasket());
		assertEquals(false,product.isCanEdit());
		assertEquals("Beef",product.getName());
		assertEquals(10,product.getPrice(),0.001);
		assertEquals("Meat",product.getCategory());
		assertEquals(2,product.getCount());
		assertEquals(9,product.getTotalLeft());
		assertEquals(false,product.isSearch());
		assertTrue(product.isOnSpecialOffer());
	
	}
	
	@Test
	public void testToString(){
		product.setName("Milk");
		assertEquals("Product : " + product.getName() + " price : " +product.getPrice() +" Category : " +product.getCategory() ,product.toString());
		
	}
}
