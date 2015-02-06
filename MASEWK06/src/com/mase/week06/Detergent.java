package com.mase.week06;

class Cleanser {
	private String s = new String("Cleanser \n");
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public void print() { System.out.println(s); }
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute(); x.apply(); x.scrub();
		x.print();
	}
}

public class Detergent extends Cleanser {
	// Change a method:
	@Override
	public void scrub() {
		append(" Detergent.scrub()");//append is inherited
		super.scrub(); // Call base-class version
	}
	// Add methods to the interface:
	public void foam() { append(" foam()"); }
	// Test the new class:
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();//polymorphism
		x.foam();//appended to the subclass interface
		x.print();
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}
} ///:~