import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class StockControlTest {
	private StockControl myStockControl;

	@Before
	public void setUp() {
		myStockControl = new StockControl("banana", 1.0, "fruit", 0, 10);
	}
	
	@Test
	public void testDefaultConstructor(){
		StockControl myStockControl = new StockControl();
	}
	
	@Test
	public void testConstructorANDGetters(){
		assertEquals("banana",myStockControl.getName());
		assertEquals(1.0,myStockControl.getPrice(),0.001);
		assertEquals("fruit",myStockControl.getCategory());
		assertEquals(0,myStockControl.getCount());
		assertEquals(10,myStockControl.getTotalLeft());
	}
	
	@Test
	public void testSetters(){
		myStockControl.setName("tomato");
		myStockControl.setPrice(2.0);
		myStockControl.setCategory("vegetable");
		myStockControl.setCount(1);
		myStockControl.setTotalLeft(5);
	}
	
	@Test
	public void testFieldsAreEmpty(){
		myStockControl.setName("");
		myStockControl.setPrice(0);
		myStockControl.setCategory("");
		myStockControl.setCount(0);
		myStockControl.setTotalLeft(0);
	}
	
	@Test
	public void testFieldsNotEmpty(){
		myStockControl.setName("a");
		myStockControl.setPrice(1);
		myStockControl.setCategory("b");
		myStockControl.setCount(1);
		myStockControl.setTotalLeft(1);
		myStockControl.setStockRemove("a");
	}
	
	@Test
	public void testStockRemove(){
		myStockControl.setName("a");
		myStockControl.setPrice(1);
		myStockControl.setCategory("b");
		myStockControl.setCount(1);
		myStockControl.setTotalLeft(1);
		myStockControl.addStock();
		myStockControl.removeStock();
	}
	
	@Test
	public void testGetList(){
		myStockControl.addStock();
		assertEquals(null,myStockControl.getProducts());
	}
	
	@Test
	public void testSetList(){
		List<Product> products = ProductData.getAllProducts();
		myStockControl.setProducts(products);
		assertEquals(null,myStockControl.getProducts());
		myStockControl.setName("a");
		myStockControl.setStockRemove("a");
	}
	
	@Test
	public void testgetStockRemove(){
		assertEquals(null,myStockControl.getStockRemove());
	}
}
