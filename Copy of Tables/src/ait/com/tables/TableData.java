package ait.com.tables;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TableData implements Serializable{
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private static List<Name> names = new ArrayList<Name>(Arrays.asList(
			new Name("william", "dupont"),
			new Name("Harry", "styles"),
			new Name("Jon", "Bonjovi")
	));
	
	public List<Name> getNames() {
		return names;
	}
	
	public String editName(Name name) {
		name.setCanEdit(true);
		return null;
	}
	
	public void saveAction(){
		for(Name name: names) {
			name.setCanEdit(false);
		}
	}
	
	public String deleteName(Name name) {
		names.remove(name);
		return null;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String addName() {
		final Name name = new Name(this.firstName, this.lastName);
		names.add(name);
		firstName=null;
		lastName =null;
		return null;
	}
}