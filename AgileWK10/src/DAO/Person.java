package DAO;

public class Person {
	int personId;
	String name;
	String address;
	
	public Person(int personId, String name, String address) {
		this.personId = personId;
		this.name = name;
		this.address = address;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
