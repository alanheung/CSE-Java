package DAO;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testAddPerson() {
		final PersonDAO database = FactoryDAO.getPersonDAO();
		int personId = 1;
		String name = "Jack";
		String address = "Athlone";
		Person jack = new Person(personId, name, address);
		database.addPerson(personId, jack);
		Person fromDB = database.getPerson(personId);
		assertTrue(fromDB.getName().equals(name));
		assertTrue(fromDB.getAddress().equals(address));
	}

}
