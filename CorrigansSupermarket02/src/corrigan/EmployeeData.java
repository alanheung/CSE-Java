package corrigan;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="customer")
@SessionScoped
public class EmployeeData implements Serializable{

	private static final long serialVersionUID = 1L;
	private static List<User> allEmployees = new ArrayList<User>(Arrays.asList(
			new User("Sam Power","skyboypower@gmail.com","password")));
	
	public static List<User> getAllEmployees(){
		return allEmployees;
	}
	
	
	public void addEmployee(User newEmployee){
		allEmployees.add(newEmployee);
	}
	
	public void removeEmployee(User oldEmployee){
		if(allEmployees.contains(oldEmployee)){
			allEmployees.remove(oldEmployee);
		}
	}
	
	public int getNumberOfEmployees(){
		return allEmployees.size();
	}
	
}