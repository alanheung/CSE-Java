
public class SampleApplication {
	public static void main(String[] args) {
		// declare some variables
		String theNameOfThePerson = "Joe Bloggs";
		String address = "Athlone";
		String favouriteFilm = "Back to the Future";
		
		int age = 25;
		
		// output the variables to the screen
		System.out.println(theNameOfThePerson);
		System.out.println(address);
		System.out.println(favouriteFilm);
		System.out.println(age);

		// declare some other variables
		String nameOutput = "My name is " + theNameOfThePerson; 
		System.out.println(nameOutput);
		String addressOutput = "My address is " + address; 
		System.out.println(addressOutput);
		String ageOutput = "My age is " + age; 
		System.out.println(ageOutput);

		// another way
		System.out.println("My age is " + age);
		

	}

}
