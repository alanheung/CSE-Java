public class Family {
	private static int n;//instance variable, static here
	
	public static void main(String[] args) {
		n=4;//error, static methods do not get this reference, to remove error insert static
		Person Kevin = new Person(25, "Kevin", "Pinewoods" );
		System.out.println("The name is "+ Kevin.getName() + ", the age is "+ Kevin.getAge()
				+", the address is "+Kevin.getAddress()+"." );
		System.out.println("Kevin.getCount() == "+Kevin.getCount());

		Person Paul = new Person(35, "Paul", "Acorn Drive");
		System.out.println("The name is "+ Paul.getName() + ", the age is "+ Paul.getAge()
				+", the address is "+Paul.getAddress()+"." );
		System.out.println("Paul.getCount() == "+Paul.getCount());
		
		Person Jack = new Person(20, "Jack", "Tree Park");
		System.out.println("The name is "+ Jack.getName() + ", the age is "+ Jack.getAge()
				+", the address is "+Jack.getAddress()+"." );
		System.out.println("Jack.getCount() == "+ Jack.getCount());
		
		System.out.println("Person.getCount() == "+ Person.getCount());//this is a static method because className.methodName
		//setting the age to static and changing Jack
		Jack.setAge(21).setAddress("Galway");
		System.out.println(Jack);
	}
}
//2nd class called Person
class Person{
	//instance variables
	private int theAge;
	private String theName, theAddress;
	private static int theCount;
//default ctor not required with assignment
//	public Person(){//default ctor
//		theAge = 0;
//		theName = "";
//		theAddress = "";
//		theCount=0;
//	}
	public Person(int aAge, String aName, String aAddress){//ctor declares instance variables
		this.theAge = aAge;
		this.theName = aName;
		this.theAddress = aAddress;
		Person.theCount ++;//static
	}
	public String getName() {//accessor method
		return theName;// this.theName, you dont have to put this as its done auto
	}
	public void setName(String aName) {//mutator method
		theName = aName;
	}
	public int getAge() {//public int getAge(Person.this) is auto passed 
		return theAge;
	}
//	public void setAge(int aAge) {
//		theAge = aAge;
//	}
	public Person setAge(int aAge) {
		theAge = aAge;
		return this;
	}
	public String getAddress() {
		return theAddress;
	}
//	public void setAddress(String aAddress) {
//		theAddress = aAddress;
//	}
	public Person setAddress(String aAddress) {
		theAddress = aAddress;
		return this;
	}
//	public int getCount() { //original without static
//		return theCount;
//	}
	public static int getCount() {//static method allows public access
		return Person.theCount;// must use className.methodName
	}
	@Override
	public String toString(){
		return 	"The name is "+ getName() + ", the age is "+ getAge()
				+", the address is "+getAddress()+"." ;
	}
}


