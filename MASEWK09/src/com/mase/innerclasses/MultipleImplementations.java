package com.mase.innerclasses;
class C{}

abstract class D{
	abstract void d1();
}

class Z extends C{
	public D makeD(){
		return new D(){
			//anonymous inner class
			@Override
			void d1(){}
		};
	}
}

public class MultipleImplementations {

	static void takesC(C c){
		System.out.println("C::c"+c);
	}
	static void takesD(D d){
		System.out.println("D::d"+d);
	}
	
	public static void main(String[] args) {
		Z z = new Z();
		takesC(z);//z is treated as a C
		//takesD(z);//error Z is not a D
		takesD(z.makeD());//z is creating a D
	}

}//
