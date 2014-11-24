import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DeliveryBeanTest {
	private DeliveryBean myDeliveryBean;
	
	@Before
	public void setUp() {
		myDeliveryBean = new DeliveryBean(12,45, "2pm");
		
	}

	@Test
	public void testSettingDeliveryTime() {
		assertEquals("2pm", myDeliveryBean.getDeliveryTime());
		myDeliveryBean.setDeliveryTime("3pm");
		assertEquals("3pm", myDeliveryBean.getDeliveryTime());
		
		
	}
	@Test
	public void testCanEdit(){
		myDeliveryBean.setCanEdit(true);
		assertEquals(true, myDeliveryBean.isCanEdit());
		myDeliveryBean.setCanEdit(false);
		assertEquals(false, myDeliveryBean.isCanEdit());
		
	}

	
}
