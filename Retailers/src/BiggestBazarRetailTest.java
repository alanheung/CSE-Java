import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import org.junit.Test;
import org.mockito.internal.verification.Times;

import static org.mockito.Mockito.*;

public class BiggestBazarRetailTest {
	private BiggestBazarRetail biggestBazarRetail;
	private ArrayList<Item> expiredList = new ArrayList<Item>();
	private Inventory inventory;
	private PublicAddressSystem pas;
	
	@Test
	public void issueDiscountOnOneItemTest() {
//create item list
	Item bread = new Item("123","Bread", 20.00, 3.00);
	expiredList.add(bread);
//stub call on inventory for getItemExpireInAMonth
	inventory = mock(Inventory.class);
//specify the behaviour of the mock object
	when(inventory.getItemsExpireInAMonth()).thenReturn(expiredList);
	when(inventory.itemsUpdated()).thenReturn(1);
//mock object for PublicAddressSystem(pas)
	pas=mock(PublicAddressSystem.class);
//create instance of SUT
	biggestBazarRetail = new BiggestBazarRetail(inventory,pas);	
//call issueDiscountForItemsToExpirein30days
	biggestBazarRetail.issueDiscountForItemsExpireIn30Days(0.2);	
//verify (spy) that the methods are called in inventory and pas
	//	verify(inventory).update(bread,16.0);
	verify(inventory,new Times(1)).update(bread,16.0);
//check for Offer object
	//	verify(pas).announce(isA(Offer.class));
	verify(pas,new Times(1)).announce(isA(Offer.class));

	
	}

	@Test
	public void discountIsNotIssued() {
//create item list
	Item bread = new Item("123","Bread", 20.00, 17.00);
	expiredList.add(bread);
//stub call on inventory for getItemExpireInAMonth
	inventory = mock(Inventory.class);
//specify the behaviour of the mock object
	when(inventory.getItemsExpireInAMonth()).thenReturn(expiredList);
	when(inventory.itemsUpdated()).thenReturn(1);
//mock object for PublicAddressSystem(pas)
	pas=mock(PublicAddressSystem.class);
//create instance of SUT
	biggestBazarRetail = new BiggestBazarRetail(inventory,pas);	
//call issueDiscountForItemsToExpirein30days
	biggestBazarRetail.issueDiscountForItemsExpireIn30Days(0.2);	
//verify (spy) that the methods are called in inventory and pas
	//	verify(inventory).update(bread,16.0);
	verify(inventory,never()).update(bread,16.0);
//check for Offer object
	//	verify(pas).announce(isA(Offer.class));
	verify(pas,never()).announce(isA(Offer.class));
	}

	@Test
	public void TestThatTwoItemsQualifiesDiscount (){
		Item bread = new Item("123","Bread", 20.00, 3.00);
		expiredList.add(bread);
		Item donut = new Item("123","Donut", 20.00, 17.00);
		expiredList.add(donut);
		Item bagel = new Item("321","Bagel", 20.00, 3.00);
		expiredList.add(bagel);
		inventory = mock(Inventory.class);

		when(inventory.getItemsExpireInAMonth()).thenReturn(expiredList);
		when(inventory.itemsUpdated()).thenReturn(1);

		pas=mock(PublicAddressSystem.class);

		biggestBazarRetail = new BiggestBazarRetail(inventory,pas);	

		biggestBazarRetail.issueDiscountForItemsExpireIn30Days(0.2);	

//		verify(inventory,new Times(1)).update(bread,16.0);
//		verify(inventory,never()).update(donut,16.0);
//		verify(inventory,new Times(1)).update(bagel,16.0);
//		verify(pas,new Times(2)).announce(isA(Offer.class));
//check more than one time
		verify(inventory,new Times(2)).update(isA(Item.class), anyDouble());
	}
	
}



