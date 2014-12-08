import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="registration")
@SessionScoped
public class Registration implements Serializable{

	private static final long serialVersionUID = 1L;
	private String fullName;
	private String email;
	private String password;
	private String verifyPassword;
	private String userType="Customer";
	private boolean fullNameEmpty;
	private boolean emailEmpty;
	private boolean passwordEmpty;
	private boolean verifyPasswordEmpty;
	private boolean emailValid;
	private boolean passwordValid;
	private boolean verifyPasswordValid;
	private boolean userAlreadyRegistered;
	private boolean step1Valid;
	private boolean step2Valid;
	private boolean allDetailsValid;
	private boolean managerLoggedIn;
	private static List<User> allUsers = UserData.getAllUsers();


	public Registration(){
		fullName="";
		email="";
		password="";
		verifyPassword="";
		userType="Customer";
	}
	
	public Registration(String fullName,String emailAddress,String password,String userType){
		this.fullName=fullName;
		this.email=emailAddress;
		this.password=password;
		this.userType=userType;
	}

	public boolean getFullNameEmpty(){
		return fullNameEmpty;
	}
	
	public boolean getEmailEmpty(){
		return emailEmpty;
	}
	
	public boolean getPasswordEmpty(){
		return passwordEmpty;
	}
	
	public boolean getVerifyPasswordEmpty(){
		return verifyPasswordEmpty;
	}
	
	public boolean getStep1Valid(){
		return step1Valid;
	}
	
	public boolean getStep2Valid(){
		return step2Valid;
	}
	
	public boolean getAllDetailsValid(){
		return allDetailsValid;
	}
	
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return email;
	}

	public void setEmailAddress(String emailAddress) {
		this.email = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String isFullNameEmpty() {
		fullNameEmpty=(fullName==null || fullName.equals(""));
		return null;
	}
	
	public String isEmailEmpty() {
		emailEmpty=(email==null || email.equals(""));
		return null;
	}

	public String isPasswordEmpty() {
		passwordEmpty=(password==null || password.equals(""));
		return null;

	}

	public String isVerifyPasswordEmpty() {
		verifyPasswordEmpty=(verifyPassword==null || verifyPassword.equals(""));
		return null;
	}
	
	public String isEmailValid(){
		emailValid=(email.contains("@") && email.contains("."));
		return null;
	}
	
	public boolean isUserAlreadyRegistered() {
		return userAlreadyRegistered;
	}

	public void setUserAlreadyRegistered(boolean userAlreadyRegistered) {
		this.userAlreadyRegistered = userAlreadyRegistered;
	}
	
	public String checkIfUserAlreadyRegistered(){
		for(User current:allUsers){
			if(current.getEmailAddress().equals(this.email)){
				userAlreadyRegistered=true;
			}
			else{
				userAlreadyRegistered=false;
			}
		}
		return null;
	}
	
	public boolean getEmailValid(){
		return emailValid;
	}
	public String isPasswordValid(){
		passwordValid=(!(password.equals(password.toLowerCase())) && !(password.equals(password.toUpperCase())));
		return null;
	}
	
	public boolean getPasswordValid(){
		return passwordValid;
	}
	
	public String isVerifyPasswordValid(){
		verifyPasswordValid=verifyPassword.equals(password);
		return null;
	}
	
	public boolean getVerifyPasswordValid(){
		return verifyPasswordValid;
	}
	
	public boolean isManagerLoggedIn() {
		return managerLoggedIn;
	}

	public void setManagerLoggedIn(boolean managerLoggedIn) {
		this.managerLoggedIn = managerLoggedIn;
	}
	
	public String validPersonalDetails(){
		isFullNameEmpty();
		isEmailEmpty();
		step1Valid=(!fullNameEmpty&&!emailEmpty);
		return null;
	}
	
	public String validPasswordDetails(){
		isPasswordEmpty();
		isPasswordValid();
		isVerifyPasswordEmpty();
		isVerifyPasswordValid();
		step2Valid=(!passwordEmpty&&!verifyPasswordEmpty);
		return null;
	}
	
	public String validationComplete(){
		validPersonalDetails();
		validPasswordDetails();
		isEmailValid();
		checkIfUserAlreadyRegistered();
		allDetailsValid=(step1Valid&&step2Valid&&emailValid&&passwordValid&&verifyPasswordValid&&userAlreadyRegistered==false);
		return null;
	}
	
	public String checkCurrentUser(){
		LoginBean currentuser = new LoginBean();
		if(currentuser.getCurrentUser().getUserType().equals("Manager")){
			managerLoggedIn=true;
			return "register?faces-redirect=true";
		}
		else{
			managerLoggedIn=false;
		}
		return null;
	}
	
	public String addRegisteredCustomerOrEmployee(){
		User newUser = new User(this.fullName,this.email,this.password,this.userType);
		allUsers.add(newUser);
		email="";
		fullName="";
		password="";
		verifyPassword="";
		fullNameEmpty=false;
		emailEmpty=false;
		passwordEmpty=false;
		verifyPasswordEmpty=false;
		step1Valid=false;
		step2Valid=false;
		allDetailsValid=false;
		managerLoggedIn=false;
		if(this.userType.equals("Customer")){
			return "registration_success?faces-redirect=true";
		}
		else{
			userType="Customer";
			return "employee_reg_success?faces-redirect=true";
		}
	}
	
	public int getNumberOfUsers(){
		return allUsers.size();
	}
	
	public void removeUser(){
		allUsers.remove(0);
	}

}
