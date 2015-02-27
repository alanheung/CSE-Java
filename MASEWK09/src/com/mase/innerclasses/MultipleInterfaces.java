package com.mase.innerclasses;

interface A{}
interface B{
	void b1();//by default public
}

class X implements A,B{
	@Override
	public void b1(){}// package
}

class Y implements A{
	public B makeB(){
		//anonymous inner class in this method
		return new B(){
			@Override
			public void b1(){
			}// package by default
		};//anonymous inner class that implements B
	}
}

public class MultipleInterfaces {

	static void takesA(A a){
		System.out.println("A::a"+a);
	}
	static void takesB(B b){
		System.out.println("B::b"+b);
	}
	public static void main(String[] args) {
		X x = new X();
		//treat X as an A and a B
		takesA(x);
		takesB(x);
		
		Y y = new Y();
		takesA(y);
		takesB(y.makeB());
		
		

	}

}
