import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private String fullName;
	private String emailAddress;
	private String password;
	private static List<Product> basket = new ArrayList<Product>();
	
	
	public User(){
		this.fullName="";
		this.emailAddress="";
		this.password="";
	}
	
	/** 
	 * @param String fullName
	 * @param String emailAddress
	 * @param String password
	 */
	public User(String fullName, String emailAddress, String password){
		this.fullName=fullName;
		this.emailAddress=emailAddress;
		this.password=password;
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
}
