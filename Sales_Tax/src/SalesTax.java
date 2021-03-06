import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesTax {
	private WebDriver driver;
	@Before
	public void setUP(){
		driver = new FirefoxDriver();
		driver.get("file:///C:/Users/A00226316/Java/Sales_Tax/WebContent/sales_tax.html");
	}
	@Test
	public void testTitle(){
		assertEquals("Sales Tax Calculator", driver.getTitle());
	}
	@Test
	public void testCalculateTotal(){
		//Get the subtotal element and set the value
		WebElement subtotalField = driver.findElement(By.id("subtotal"));
		subtotalField.clear();
		subtotalField.sendKeys("100");
	
		//Get the TaxRate element and set the value
		WebElement taxRateField = driver.findElement(By.id("taxRate"));
		taxRateField.clear();
		taxRateField.sendKeys("10");
		
		//Click on the Calculate Button
		WebElement calculateButton = driver.findElement(By.id("calculate"));
		calculateButton.click();
		
		//Get the sales tax and verify its value
		WebElement salesTaxField = driver.findElement(By.id("salesTax"));
		System.out.println(salesTaxField.getText());
		assertEquals("10", salesTaxField.getAttribute("value"));
		
		//Get the total element and verify its value
		WebElement totalField = driver.findElement(By.id("total"));
		assertEquals("110.00", totalField.getAttribute("value"));
	}
	@After
	public void tearDown() throws Exception{
		//Close the browser
		driver.quit();
	}
}//
