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
	 private static List<Name> names= new ArrayList<Name>(Arrays.asList
			 (new Name ("Willian","Dupont"),
					 new Name ("Harry","Stiles"),
					 new Name ("Jon","Bonjovi"))
					 );
	 public List<Name> getNames(){
		 return names;
	 }
}
