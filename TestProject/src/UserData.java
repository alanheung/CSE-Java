import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="customer")
@SessionScoped
public class UserData implements Serializable{
	private String fullName;
	private String address;
	private String mobileNumber;
	private String emailAddress;
	private String password;
	private String userType;
	private static final long serialVersionUID = 1L;
	private static List<User> allUsers = new ArrayList<User>(Arrays.asList(
			new User("Sam Power","23 Hazel Park","0872369852","spower@gmail.com","Password","Customer"),
			new User("Aidan Higgins","14 Hodson Bay Road","0860523697","ahiggins@gmail.com","Password","Delivery Driver"),
			new User("Joe Bloggs","56 Willow Park","0854213698","jbloggs@gmail.com","Password","Stock"),
			new User("Colm Fitzgerald","16 Main Street","0863219687","cfitzgerald@gmail.com","Password","Manager"),
			new User("Alan Heung","1 Main Street","0891234567","aheung@gmail.com","Password","Customer"))
			);

	public static List<User> getAllUsers(){
		return allUsers;
	}
	
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
	
	public String editUser(User name){
		name.setCanEditUser(true);
		return null;
	}
	
	public void saveAction(){
		for(User user:allUsers){
			user.setCanEditUser(false);
		}
	}
	
	public String deleteUser(User user){
		allUsers.remove(user);
		return null;
	}
	
	public String addUser(){
		final User user=new User(this.fullName,this.address,this.mobileNumber,this.emailAddress,this.password,this.userType);
		if(!fullName.isEmpty() && !address.isEmpty() && !mobileNumber.isEmpty() && !emailAddress.isEmpty() ){
			allUsers.add(user);
		}
		fullName=null;
		address=null;
		mobileNumber=null;
		emailAddress=null;
		password=null;
		userType=null;
		return null;
		
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber=mobileNumber;
	}
}
