package ait.com.tables;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped

public class TableData implements Serializable{
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private boolean sortAscending = true;
	
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
	
	private static List<Name> names= new ArrayList<Name>(Arrays.asList(
			new Name ("William","Dupont"),
			new Name ("Harry","Stiles"),
			new Name ("Jon","Bonjovi")
			));
	
	public List<Name> getNames(){
		return names;
	}
	public String editName(Name name){
		name.setCanEdit(true);
		return null;
	}
	public String deleteName(Name name){
		names.remove(name);
		return null;
	}
	public void saveAction(){
		//set canEdit of all employees to false
		for(Name name: names){
			name.setCanEdit(false);
		}
	}
	public String addName(){
		final Name name = new Name(this.firstName, this.lastName);
		names.add(name);
		firstName=null;
		lastName=null;
		return null;
	}
	
	public String sortByFirstName(){
		if(sortAscending){
			//ascending order
			Collections.sort(names, new Comparator<Name>(){
				@Override
				public int compare(Name name1, Name name2){
					return name1.getFirst().compareTo(name2.getFirst());
				}
			});
			sortAscending=false;
		}else{
			//ascending order
			Collections.sort(names, new Comparator<Name>(){
				@Override
				public int compare(Name name1, Name name2){
					return name2.getFirst().compareTo(name1.getFirst());
				}
			});
			sortAscending=true;
		}return null;
	}
	
	public String sortByLastName(){
		if(sortAscending){
			//ascending order
			Collections.sort(names, new Comparator<Name>(){
				@Override
				public int compare(Name name1, Name name2){
					return name1.getLast().compareTo(name2.getLast());
				}
			});
			sortAscending=false;
		}else{
			//ascending order
			Collections.sort(names, new Comparator<Name>(){
				@Override
				public int compare(Name name1, Name name2){
					return name2.getLast().compareTo(name1.getLast());
				}
			});
			sortAscending=true;
		}return null;
	}
}//