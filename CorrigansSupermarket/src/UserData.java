import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="customer")
@SessionScoped
public class UserData implements Serializable{

	private static final long serialVersionUID = 1L;
	private static List<User> allUsers = new ArrayList<User>(Arrays.asList(
			new User("Sam Power","skyboypower@gmail.com","password","Customer"),
			new User("Aidan Higgins","ahig@gmail.com","Password","Delivery Driver"),
			new User("Joe Bloggs","j.bloggs@gmail.com","Athlone","Stock"),
			new User("Colm Fitzgerald","colm.fitzgerald10@gmail.com","Corrigans","Manager")));
	
	
	
	public static List<User> getAllUsers(){
		return allUsers;
	}
	
	
	
//	public List<User> getCustomers(){
//		List<User> allCustomers = new ArrayList<User>();
//		for(User aCustomer: allUsers){
//			if(aCustomer.getUserType().equals("Customer")){
//				allCustomers.add(aCustomer);
//			}
//		}
//		return allCustomers;
//	}
	
	public void addUser(User newUser){
		allUsers.add(newUser);
	}
	
	public void removeUser(User oldUser){
		if(allUsers.contains(oldUser)){
			allUsers.remove(oldUser);
		}
	}
	
	public int getNumberOfUsers(){
		return allUsers.size();
	}
	
	
}
