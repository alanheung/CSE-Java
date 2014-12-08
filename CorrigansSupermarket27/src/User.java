import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private String fullName;
	private String address;
	private String mobileNumber;
	private String emailAddress;
	private String password;
	private String userType;
	private boolean canEditUser;
	private static List<Product> basket = new ArrayList<Product>();
	
	
	public User(){
		this.fullName="";
		this.address="";
		this.mobileNumber="";
		this.emailAddress="";
		this.password="";
		this.userType="";
	}
	
	/** 
	 * @param String fullName
	 * @param String emailAddress
	 * @param String password
	 */
	public User(String fullName,String address,String mobileNumber,String emailAddress, String password, String userType){
		this.fullName=fullName;
		this.emailAddress=emailAddress;
		this.password=password;
		this.userType=userType;
		this.address=address;
		this.mobileNumber=mobileNumber;
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
	
	public void setBasket(List<Product> basket){
		User.basket=basket;
	}
	
	public List<Product> getBasket(){
		return basket;
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

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public boolean isCanEditUser(){
		return canEditUser;
	}
	
	public void setCanEditUser(boolean canEditUser){
		this.canEditUser=canEditUser;
	}
}
