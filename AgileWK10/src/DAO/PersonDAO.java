package DAO;

public interface PersonDAO {
	Person getPerson(int personId);
	boolean addPerson(int personId, Person person);
}
