import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ CustomerDataTest.class, DeliveryBeanTest.class,
		EmployeeDataTest.class, LoginBeanTest.class, ProductDataTest.class,
		ProductTest.class, RegistrationTest.class, UserTest.class })
public class AllTests {

}
