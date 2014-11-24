

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProductTest {

	private Product product;
	
	@Before
	public void setUp(){
		product = new Product("Milk",1.50,"Dairy",1,15);
	}

	@Test
	public void testConstructorANDGetters() {
		assertEquals("Milk",product.getName());
		assertEquals(1.50,product.getPrice(),0.001);
		assertEquals("Dairy",product.getCategory());
		assertEquals(1,product.getCount());
		assertEquals(15,product.getTotalLeft());
	}
	@Test
	public void testSetters() {
		product.setName("Beef");
		product.setPrice(10);
		product.setCategory("Meat");
		product.setCount(2);
		product.setTotalLeft(9);
		product.setInBasket(1);
		product.setCanEdit(false);
		assertEquals(1,product.getInBasket());
		assertEquals(false,product.isCanEdit());
		assertEquals("Beef",product.getName());
		assertEquals(10,product.getPrice(),0.001);
		assertEquals("Meat",product.getCategory());
		assertEquals(2,product.getCount());
		assertEquals(9,product.getTotalLeft());
	}

}
