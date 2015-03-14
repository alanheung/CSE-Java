package com.mase.innerclasses3;

public class Parcel3 extends A{

	private int x=44;

	//cont
	private class PContents implements Contents{
		private int i;
		@Override
		public int value() {
			return i;
		}
	}

	protected class PDestination implements Destination{

		private String label;

		private PDestination(String whereTo){// note private constructor
			label=whereTo;
		}
		@Override
		public String readLabel() {
			return null;
		}	
	}

	public Destination dest(String s){
		return new PDestination(s);//
	}
	public Contents cont(){
		return new PContents();//
	}

	// inner demos that inner classes enable multiple
	//implementation inheritance
	class Inner extends B{
		int getPrivateDataFromOuterClass(){
			return x;//private data from the outer class
		}
		public void testInheritedMethods(){
			methodFromClassB();
			methodFromClassA();
		}
	}
}

class Test {

	public static void main(String[] args) {
		Parcel3 parcel = new Parcel3();
		Parcel3.Inner inner = parcel.new Inner();
		
//		parcel.getPrivateDataFromOuterClass();
		
		inner.testInheritedMethods();
		Contents contents = parcel.cont();
		Destination destination = parcel.dest("Tanzania");

		System.out.println(contents.value());
		System.out.println(destination.readLabel());
		
	}

}

