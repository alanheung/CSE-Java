package ait.com.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@ManagedBean 
@SessionScoped 
public class CustomerBean implements Serializable{

	private static final long serialVersionUID =1L;

	private String firstName;
	private String lastName;
	private String email;
	private String hearAbout;
	private String contactBy;
	public boolean rememberMe;

	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName =firstName;
	}
	public String getLastName(){
		return firstName;
	}
	public void setLastName(String lastName){
		this.lastName =lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setHearAbout(String hearAbout) {
		this.hearAbout = hearAbout;
	}
	private static Map<String,Object> hearAboutValue;
	static{
		hearAboutValue = new LinkedHashMap<String,Object>();
		hearAboutValue.put("Search Engine", "Search Engine"); //label, value
		hearAboutValue.put("Friend", "Friend");
		hearAboutValue.put("Other", "Other");
	}
	public Map<String,Object> getHearAbout() {
		return hearAboutValue;
	}
	
	public String getContactBy() {
		return contactBy;
	}
	public void setContactBy(String contactBy) {
		this.contactBy = contactBy;
	}
	private static Map<String,Object> contactByValue;
	static{
		contactByValue = new LinkedHashMap<String,Object>();
		contactByValue.put("Email", "Email"); //label, value
		contactByValue.put("Post", "Post");
		contactByValue.put("Email", "Other ");
	}
 
	public Map<String,Object> getFavCoffee2Value() {
		return contactByValue;
	}
	
	public boolean isRememberMe() {
		return rememberMe;
	}
	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
	
	



}//
