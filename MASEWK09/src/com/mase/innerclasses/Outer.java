package com.mase.innerclasses;

public class Outer {
//	private int privateOuterData = 20;
	
	class Inner{
//		private int privateInnerData = 10;

//		public void display(){
//			System.out.println("Inner accessing Inner private data: "+privateInnerData);
//			System.out.println("Inner accessing Outer private data: "+privateOuterData);
//		}
		public void myMethod(){
			//call the outer version of toString
			System.out.println(Outer.this.toString());
			
			//call the object version of toString
			System.out.println(Outer.super.toString());
			
			//call the inner version of toString
			System.out.println(this.toString());
			System.out.println(toString());
			System.out.println(this);
		}
		@Override
		public String toString() {
			return "Inner::toString()";
		}	
	}
	
	public static void main(String[] args) {
//		Outer outerRef = new Outer();
//		Outer.Inner innerRef = new Outer().new Inner();
//		
//		//Outer class has access to private Outer data(obviously)
//		System.out.println("Outer accessing Outer private data: "+outerRef.privateOuterData);//20
//
//		//Outer class has access to private Inner data
//		//by using the Inner class reference
//		System.out.println("Outer accessing Inner private data: "+innerRef.privateInnerData);//10
//
//		innerRef.display();//10, 20
		
		
//		new Outer().new Inner().myMethod();	
		Outer o = new Outer();
		Inner i = o.new Inner();
		i.myMethod();
	}
	@Override
	public String toString() {
		return "Outer::toString()";
	}


}//
