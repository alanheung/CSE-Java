package com.mase.week06;

class WithFinals{
	private final void f(){//identical to private alone
		System.out.println("WithFinals::f ");
	}
	private void g(){//this is automatically final
		System.out.println("WithFinals::g ");
	}
	protected void h(){
		System.out.println("WithFinals::h ");
	}
	void i(){//this is package private
		System.out.println("WithFinals::i ");
	}
}
//class OverridingPrivate extends WithFinals{
class A extends WithFinals{
	//@Override //cannot override as its already private
	private final void f(){
		System.out.println("A::f ");
	}
	private final void g(){
		System.out.println("A::g ");
	}
}
//class OverridingPrivate2 extends WithFinals{
class B extends WithFinals{
	//these are new methods (not overriding anything)
	//@Override //no such super method as its already private
	public final void f(){
		System.out.println("B::f ");
	}
	public final void g(){
		System.out.println("B::g ");
	}
	public final void h(){
		System.out.println("B::h ");
	}
	public final void k(){
		System.out.println("B::k ");
	}
}

public class FinalMethods {
	public static void main(String[] args){
		//		OverridingPrivate2 op2 = new OverridingPrivate2();// B //op2=b
		//		op2.f();
		//		op2.g();
		//		OverridingPrivate op = new OverridingPrivate();// A //op =a
		//		//op.f();// private access
		//		op.h();// ok inherited
		//		op.i();//ok inherited

		B b = new B();
		b.f();
		b.g();
		
		A a = new A();
		//a.f()//private access
		a.h();//ok inherited
		a.i();//ok inherited

		B a2 = b;
		//a2.f();// Private method is accessible - inside of class up in WithFinals
		//a2.g();// not visible

		WithFinals wf = b;
		//wf.f();// Private method is accessible - inside of class up in WithFinals
		//wf.g();
		
		wf.h();// B::h
		//wf.k();// the methods you can call are determined by the type as there is no method k in the class withfinals
	}
}//


