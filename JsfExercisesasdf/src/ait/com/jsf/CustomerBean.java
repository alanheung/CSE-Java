package ait.com.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class CustomerBean implements Serializable{

	private static final long serialVersionUID =1L;
	
	private String firstName;
	private String lastName;
	private String email;

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

}//
