package com.oop1.inheritance;

class ClassA{
	@Override
	public String toString(){
		return "Class A";
	}
}

public class ClassB extends ClassA{
	@Override
	public String toString() {
		return "Class B";
	}

	public static void main (String[]args){
		ClassA a1 = new ClassA();
		ClassA a2 = new ClassB();
		a1 = a2;
		a2 = a1;
		System.out.println(a1);
		System.out.println(a2);
		
//		ClassB b1 = a1;//type mismatch
		ClassB b1 = (ClassB)a1;
		ClassB b2 = (ClassB)a2;
		System.out.println(b1);
		System.out.println(b2);
		
		a1 = new ClassA();
//		b1 = a1;//type mismatch
		b1 = (ClassB)a1;
		System.out.println(b1);//ClassCastException ClassA cannot be cast to 
//		com.oop1.inheritance.ClassA cannot be cast to com.oop1.inheritance.ClassB
//		at com.oop1.inheritance.ClassB.main

		a1 = b1;//put subclass into parent class- no prob
		System.out.println(b1);

		
	}
}