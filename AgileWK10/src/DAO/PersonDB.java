package DAO;

import java.util.HashMap;
import java.util.Map;

public class PersonDB implements PersonDAO{
	private Map<Integer, Person> persons =new HashMap<Integer, Person>();
	
	@Override
	public Person getPerson(int personId){
		return persons.get(personId);
	}
	
	@Override
	public boolean addPerson(int personId, Person person){
		persons.put(personId, person);
		return true;
	}
}
