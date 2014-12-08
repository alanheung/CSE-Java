import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="userDetails")
@SessionScoped
public class UserDetails implements Serializable{

	
	@Override
	public String toString() {
		return "Name : " + name + "\tAddress : " + address + "\tTime : " + time + "\nOrder : " + order + "\nNote : " + note;
	}

	private String name;
	private String order;
	private String note;
	private String address;
	private String time;
	private String mobileNo;
	
	public UserDetails() {
		
	}
	
	public UserDetails(String name, String order, String note, String address, String time, String mobileNo) {
		this.name = name;
		this.order = order;
		this.note = note;
		this.address = address;
		this.time = time;
		this.mobileNo = mobileNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getOrder() {
		return order;
	}
	
	public void setOrder(String order) {
		this.order = order;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}