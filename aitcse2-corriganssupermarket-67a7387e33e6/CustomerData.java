import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="customer")
@SessionScoped
public class CustomerData implements Serializable{

	private static final long serialVersionUID = 1L;
	private static List<User> allCustomers = new ArrayList<User>(Arrays.asList(
			new User("Sam Power","skyboypower@gmail.com","password")));
	
	public static List<User> getAllCustomers(){
		return allCustomers;
	}
	
	public void addCustomer(User newCustomer){
		allCustomers.add(newCustomer);
	}
	
	public void removeCustomer(User oldCustomer){
		if(allCustomers.contains(oldCustomer)){
			allCustomers.remove(oldCustomer);
		}
	}
	
	public int getNumberOfCustomers(){
		return allCustomers.size();
	}
	
}
