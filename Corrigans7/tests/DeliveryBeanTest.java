import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DeliveryBeanTest {
	private deliveryBean myDeliveryBean;
	
	@Before
	public void setUp() {
		myDeliveryBean = new deliveryBean(12,45, "2pm");
		
	}

	@Test
	public void testSettingDeliveryTime() {
		assertEquals("2pm", myDeliveryBean.getDeliveryTime());
		myDeliveryBean.setDeliveryTime("3pm");
		assertEquals("3pm", myDeliveryBean.getDeliveryTime());	
	}
	
	@Test
	public void testConstructor() {
		myDeliveryBean=new deliveryBean();
	}
	
	@Test
	public void testCanEdit(){
		myDeliveryBean.setCanEdit(true);
		assertEquals(true, myDeliveryBean.isCanEdit());
		myDeliveryBean.setCanEdit(false);
		assertEquals(false, myDeliveryBean.isCanEdit());
		
	}

	
}
