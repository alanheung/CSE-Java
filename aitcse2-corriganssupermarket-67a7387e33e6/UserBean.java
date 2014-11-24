import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user")
@SessionScoped
public class UserBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String type;
	private boolean isLoggedIn;
	public static ArrayList<UserBean> users = new ArrayList<UserBean>();
	
	
	public UserBean(String username, String password, String type) {
		super();
		this.username = username;
		this.password = password;
		this.type = type;
		isLoggedIn = false;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean getisLoggedIn(){
		return this.isLoggedIn;
	}
	public void setisLoggedIn(boolean isLoggedIn){
		this.isLoggedIn=isLoggedIn;
	}
	
}
