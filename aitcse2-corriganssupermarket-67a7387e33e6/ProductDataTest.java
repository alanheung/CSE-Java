import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProductDataTest {
	private ProductData myProductData;

	@Before
	public void setUp() {
		myProductData = new ProductData();
	}

	@Test
	public void testNoItemToBasket(){
		assertEquals(0,myProductData.getNumberInBasket());

	}

	@Test
	public void testAddAndRemoveItemToBasket(){
		assertEquals(0,myProductData.getNumberInBasket());
		Product milk = new Product("Milk",1.00,"Dairy",0,10);
		assertEquals(0,myProductData.getNumberInBasket());
		myProductData.addToBasket(milk, 3);
		assertEquals(3,myProductData.getNumberInBasket());
		myProductData.removeFromBasket(milk, 1);
		assertEquals(2,myProductData.getNumberInBasket());
		Product bread = new Product("Bread",1.00,"Bakery",0,10);
		myProductData.addToBasket(bread, 1);
		myProductData.removeFromBasket(bread, 1);
		assertFalse(myProductData.getBasket().contains(bread));
		myProductData.removeFromBasket(milk, 2);
	}
	


	@Test
	public void testGetSubTotal(){
		assertEquals(0,myProductData.getNumberInBasket());
		Product bread = new Product("Bread",1.00,"Bakery",0,10);
		myProductData.addToBasket(bread, 1);
		assertEquals(1,myProductData.getNumberInBasket());
		assertEquals(1.00, myProductData.getSubTotal(),.000001);
		myProductData.removeFromBasket(bread, 1);
	
	}
	
	@Test
	public void testGetSetTotal(){
		assertEquals(0,myProductData.getNumberInBasket());
		Product bread = new Product("Bread",1.00,"Bakery",0,10);
		myProductData.addToBasket(bread, 1);
		myProductData.setSubTotal(1);
		assertEquals(1,myProductData.getNumberInBasket());
		assertEquals(1.1, myProductData.getTotal(),0.0001);
		myProductData.removeFromBasket(bread, 1);
		myProductData.setTotal(10);
		assertEquals(10, myProductData.getTotal());

	}
	
}

