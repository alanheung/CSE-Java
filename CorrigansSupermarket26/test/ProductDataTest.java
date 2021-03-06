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
		Product milk = new Product("Milk",1.00,"Dairy",0,10,false);
		assertEquals(0,myProductData.getNumberInBasket());
		myProductData.addToBasket(milk, 3);
		assertEquals(3,myProductData.getNumberInBasket());
		myProductData.removeFromBasket(milk, 1);
		assertEquals(2,myProductData.getNumberInBasket());
		Product bread = new Product("Bread",1.00,"Bakery",0,10,false);
		myProductData.addToBasket(bread, 1);
		myProductData.removeFromBasket(bread, 1);
		assertFalse(myProductData.getBasket().contains(bread));
		myProductData.removeFromBasket(milk, 2);
	}
	


	@Test
	public void testGetSubTotal(){
		assertEquals(0,myProductData.getNumberInBasket());
		Product bread = new Product("Bread",1.00,"Bakery",0,10,false);
		myProductData.addToBasket(bread, 1);
		assertEquals(1,myProductData.getNumberInBasket());
		assertEquals(1.00, myProductData.getSubTotal(),.000001);
		myProductData.removeFromBasket(bread, 1);
	
	}
	
	@Test
	public void testGetTotal(){
		assertEquals(0,myProductData.getNumberInBasket());
		Product bread = new Product("Bread",1.00,"Bakery",0,10,false);
		myProductData.addToBasket(bread, 1);
		myProductData.setSubTotal(1);
		assertEquals(1,myProductData.getNumberInBasket());
		assertEquals(1.1, myProductData.getTotal(),0.0001);
		myProductData.removeFromBasket(bread, 1);
	
	}
	
//	@Test
//	public void testFoundSearchedProducts(){
//		Product product = new Product("Milk",1.50,"Dairy",1,15);
//		myProductData.setSearchQuery("Milk");
//		myProductData.conductSearch();
//		assertEquals(true,product.isSearch());
//	}
//	
//	@Test
//	public void testNotFoundSearchedProducts(){
//		Product product = new Product("Fish",1.50,"Dairy",1,15);
//		myProductData.setSearchQuery("Fish");
//		myProductData.conductSearch();
//		assertEquals(false,product.isSearch());
//	}
//	@Test
//	public void testResetFunction(){
//		Product currentProduct = new Product("Milk",1.50,"Dairy",1,15);
//		currentProduct.setSearch(false);
//		myProductData.reset();
//		assertEquals(true,currentProduct.isSearch());
//	}
	
}

