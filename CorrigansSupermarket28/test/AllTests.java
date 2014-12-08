import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ UserDataTest.class, DeliveryBeanTest.class,
		LoginBeanTest.class, ProductDataTest.class,
		ProductTest.class, RegistrationTest.class, UserTest.class })
public class AllTests {

}
