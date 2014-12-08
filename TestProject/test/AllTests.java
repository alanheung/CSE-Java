import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ DeliveryBeanTest.class, LoginBeanTest.class,
		ProductDataTest.class, ProductTest.class, RegistrationTest.class,
		StockControlTest.class, UserDataTest.class, UserDetailsTest.class,
		UserTest.class })
public class AllTests {

}
