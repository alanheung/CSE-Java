import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringReverseTest {

	private StringReverse sr = new StringReverse();

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testEmptyString() {
		assertEquals(sr.reverse(""),"");
	}
	
	
//	@Test
//	public void testPassInAStringExpectingError() {
//		assertEquals(sr.reverse("hello"),"ello");
//	}
	
	@Test
	public void testPassInAString() {
		assertEquals(sr.reverse("hello"),"olleh");
	}
	
	@Test
	public void testPassInAStringWithSpace() {
		assertEquals(sr.reverse("SPACE SPACE"),"ECAPS ECAPS");
	}

}
