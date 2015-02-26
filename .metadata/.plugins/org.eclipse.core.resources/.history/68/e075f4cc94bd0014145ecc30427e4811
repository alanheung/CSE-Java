package com.immutable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//class SubContract extends Contract{
//	private SubContract(String name, Integer age, Date dateSigned){
//		super(name, age, dateSigned);
//	}
//}

class Contract{
	private final String name;
	private final Integer age;
	private final Date dateSigned;
	
	private Contract(String name, Integer age, Date dateSigned){
		this.name=name;
		this.age=age;
		this.dateSigned= new Date(dateSigned.getTime());
		System.out.println("this.name ref\t\t =="+Integer.toHexString(System.identityHashCode(this.name)));
		System.out.println("this.age ref\t\t =="+Integer.toHexString(System.identityHashCode(this.age)));
		System.out.println("this.dateSigned ref\t =="+Integer.toHexString(System.identityHashCode(this.dateSigned)));

	}
	public static Contract createNewInstance(String name, Integer age, Date dateSigned){
		return new Contract(name, age, dateSigned);
	}
	public String getName() {
		return name;//Immutable by default => ok
	}
	public Integer getAge() {
		return age;//Immutable by default => ok
	}
	public Date getDateSigned() {
		return new Date(dateSigned.getTime());
	}
	@Override
	public String toString() {
		return "Contract [name=" + name + ", age=" + age + ", dateSigned="
				+ dateSigned + "]";
	}
	
}
public class TestImmutable {
	public static void main(String[] args) throws ParseException{
		DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		Date dateSigned = formatter.parse("16/02/15");
		Contract contract = Contract.createNewInstance("Michael", 21, dateSigned);
		System.out.println("\nBefore change :"+contract);
		
		//get the data
		String name = contract.getName();
		Integer age = contract.getAge();
		Date dateOfSigning = contract.getDateSigned();
		
		System.out.println("\n1.name ref returned\t\t =="+Integer.toHexString(System.identityHashCode(name)));
		System.out.println("1.age ref returned\t\t =="+Integer.toHexString(System.identityHashCode(age)));
		System.out.println("1.dateOfSigning ref returned\t =="+Integer.toHexString(System.identityHashCode(dateOfSigning)));
		
		//change what we just got back
		name="Mick"; 
		age=30; 
		dateOfSigning.setTime(1000);
		System.out.println("\n Changed date: "+dateOfSigning);
		
		System.out.println("\n2.name ref after change\t\t =="+Integer.toHexString(System.identityHashCode(name)));
		System.out.println("2.age ref after change\t\t =="+Integer.toHexString(System.identityHashCode(age)));
		System.out.println("2.dateOfSigning ref after change =="+Integer.toHexString(System.identityHashCode(dateOfSigning)));
		
		//Was the original data modified? it stays the same unchanged
		System.out.println("\nAfter change :"+contract);

	}
}
//
//The Sun (Oracle) documentation has an excellent checklist on how to make an immutable object.
//
//1.Don't provide "setter" methods — methods that modify fields or objects referred to by fields.
//2.Make all fields final and private.
//3.Don't allow subclasses to override methods. The simplest way to do this is to declare the class as final. A more sophisticated approach is to make the constructor private and construct instances in factory methods.
//4.If the instance fields include references to mutable objects, don't allow those objects to be changed:
//    Don't provide methods that modify the mutable objects.
//    Don't share references to the mutable objects. Never store references to external, mutable objects passed to the constructor; if necessary, create copies, and store references to the copies. Similarly, create copies of your internal mutable objects when necessary to avoid returning the originals in your methods.
//

