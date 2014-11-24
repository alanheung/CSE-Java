import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped; 

@ManagedBean(name="login")
@SessionScoped
public class LoginBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	private boolean emailFieldEmpty;
	private boolean passwordFieldEmpty;
	private boolean emailAndPasswordCorrect=true;
	private boolean validationComplete;
	private static boolean userLoggedIn;
	private static User currentUser;
	private static List<User> customers = CustomerData.getAllCustomers();
//	private static List<User> employees = EmployeeData.getAllEmployees();
	
	public LoginBean(){
		email="";
		password="";
	}
	
	public LoginBean(String email,String password){
		this.email=email;
		this.password=password;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getEmailValid() {
		return (email.contains("@") && email.contains("."));
	}
	
	public boolean getEmailFieldEmpty() {
		return emailFieldEmpty;
	}

	public void setEmailFieldEmpty(boolean emailFieldEmpty) {
		this.emailFieldEmpty = emailFieldEmpty;
	}

	public boolean getPasswordFieldEmpty() {
		return passwordFieldEmpty;
	}

	public void setPasswordFieldEmpty(boolean passwordFieldEmpty) {
		this.passwordFieldEmpty = passwordFieldEmpty;
	}

	public boolean getEmailAndPasswordCorrect() {
		return emailAndPasswordCorrect;
	}

	public void setEmailAndPasswordCorrect(boolean emailAndPasswordCorrect) {
		this.emailAndPasswordCorrect = emailAndPasswordCorrect;
	}

	public boolean getValidationComplete() {
		return validationComplete;
	}

	public void setValidationComplete(boolean validationComplete) {
		this.validationComplete = validationComplete;
	}

	public boolean getUserLoggedIn(){
		return userLoggedIn;
	}
	
	public void setUserLoggedIn(boolean b) {
		LoginBean.userLoggedIn=b;
	}
	
	
	public String checkLogin(){
		for(User current:customers){
			if(current.getEmailAddress().equals(this.email)){
				if(current.getPassword().equals(this.password)){
					emailAndPasswordCorrect=true;
					LoginBean.userLoggedIn=true;
					currentUser=current;
					return "index?faces-redirect=true";
				}
				else{
					emailAndPasswordCorrect=false;
				}
			}
			else{
				emailAndPasswordCorrect=false;
			}
		}
		return null;
	}
	
	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		LoginBean.currentUser = currentUser;
	} 
	
	public String logout(){
		setUserLoggedIn(false);
		User temp = new User();
		setCurrentUser(temp);
		return "index?redirect=true";
	}



}
