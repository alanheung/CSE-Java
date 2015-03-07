package DAO;

public class FactoryDAO {
	private static PersonDAO pDAO = new PersonDB();
	
	public static PersonDAO getPersonDAO(){
		return pDAO;
	}
}
